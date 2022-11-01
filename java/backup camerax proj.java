package com.example.idek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageAnalysisConfig;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureConfig;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.PreviewConfig;
import androidx.lifecycle.LifecycleOwner;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import java.nio.ByteBuffer;

//ik haat mijzelf dus daarom maak ik een camera ding met een api dat nog niet eens in de beta stage is
//en waarvan de tutorial in een taal is dat ik 0% begrijp
//saus: https://codelabs.developers.google.com/codelabs/camerax-getting-started/

public class MainActivity extends AppCompatActivity {
    //private int REQUEST_CODE_PERMISSIONS = 10; //idek volgens tutorial is dit een arbitraire nummer zou helpen als je app meerdere toestimmingen vraagt
    //private final String[] REQUIRED_PERMISSIONS = new String[]{"android.permission.CAMERA"}; //array met permissions vermeld in manifest
    TextureView txView;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txView = findViewById(R.id.view_finder);
        startCamera();

        /*if(allPermissionsGranted()){

        } else{
            ActivityCompat.requestPermissions(this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS);
        }*/
    }

    private void startCamera() {//heel veel dingen gebeuren hier
        //eerst zeker zijn dat de camera niet gebruikt wordt.
        CameraX.unbindAll();

        /* doe preview weergeven */
        int aspRatioW = txView.getWidth(); //haalt breedte scherm op
        int aspRatioH = txView.getHeight(); //haalt hoogte scherm op
        Rational asp = new Rational (aspRatioW, aspRatioH); //helpt bij zetten aspect ratio
        Size screen = new Size(aspRatioW, aspRatioH); //grootte scherm ofc

        PreviewConfig pConfig = new PreviewConfig.Builder().setTargetAspectRatio(asp).setTargetResolution(screen).build();
        Preview pview = new Preview(pConfig);

        pview.setOnPreviewOutputUpdateListener(
            new Preview.OnPreviewOutputUpdateListener() {
                //eigenlijk maakt dit al een nieuwe texturesurface aan
                //maar aangezien ik al eentje heb gemaakt aan het begin...
                @Override
                public void onUpdated(Preview.PreviewOutput output){
                    ViewGroup parent = (ViewGroup) txView.getParent();
                    parent.removeView(txView); //moeten wij hem eerst yeeten
                    parent.addView(txView, 0);

                    txView.setSurfaceTexture(output.getSurfaceTexture()); //dan weer toevoegen
                    //updateTransform(); //en dan updaten
                }
            });

        /* image capture */

        /*ImageCaptureConfig imgConfig = new ImageCaptureConfig.Builder().setCaptureMode(ImageCapture.CaptureMode.MIN_LATENCY).setTargetRotation(getWindowManager().getDefaultDisplay().getRotation()).build();
        ImageCapture imgCap = new ImageCapture(imgConfig);*/

        /* image analyser */

        ImageAnalysisConfig imgAConfig = new ImageAnalysisConfig.Builder().setImageReaderMode(ImageAnalysis.ImageReaderMode.ACQUIRE_LATEST_IMAGE).build();
        final ImageAnalysis imgAsys = new ImageAnalysis(imgAConfig);

        imgAsys.setAnalyzer(
            new ImageAnalysis.Analyzer(){
                @Override
                public void analyze(ImageProxy image, int rotationDegrees){

                    try {
                        ByteBuffer bf = image.getPlanes()[0].getBuffer();
                        byte[] b = new byte[bf.capacity()];
                        bf.get(b);
                        Rect r = image.getCropRect();
                        int w = image.getWidth();
                        int h = image.getHeight();

                        PlanarYUVLuminanceSource sauce = new PlanarYUVLuminanceSource(b ,w, h, r.left, r.top, r.width(), r.height(),false);
                        BinaryBitmap bit = new BinaryBitmap(new HybridBinarizer(sauce));

                        result = new qrReader().decoded(bit);
                        System.out.println(result);
                        Toast.makeText(getBaseContext(), result, Toast.LENGTH_SHORT).show();
                        Log.wtf("F: ", result);

                    } catch (NotFoundException e) {
                        e.printStackTrace();
                    } catch (FormatException e) {
                        e.printStackTrace();
                    }

                }
             }
        );

        //bindt de shit hierboven aan de lifecycle:
        CameraX.bindToLifecycle((LifecycleOwner)this, imgAsys, /*imgCap,*/ pview);
    }


    /*private void updateTransform(){
        //compenseert veranderingen in orientatie voor viewfinder, aangezien de rest van de layout in portrait mode blijft.
        //methinks :thonk:
        Matrix mx = new Matrix();
        float w = txView.getMeasuredWidth();
        float h = txView.getMeasuredHeight();

        //berekent het midden
        float cX = w / 2f;
        float cY = h / 2f;

        int rotDgr; //voor de switch < propt in hoeveel graden shit is gekanteld

        //Display a = txView.getDisplay(); //ok dan stoppen wij .getdisplay in z'n eigen shit.
        int rtrn = (int)txView.getRotation(); //dan dit maar in een aparte int zetten want alles deed boem bij het opstarten
        //omfg het komt omdat .getDisplay erin zit.

        switch(rtrn){
            case Surface.ROTATION_0:
                rotDgr = 0;
                break;
            case Surface.ROTATION_90:
                rotDgr = 90;
                break;
            case Surface.ROTATION_180:
                rotDgr = 180;
                break;
            case Surface.ROTATION_270:
                rotDgr = 270;
                break;
            default:
                return;
        }

        mx.postRotate((float)rotDgr, cX, cY); //berekent preview out put aan de hand van hoe de toestel gedraaid is

        float buffer = txView.getMeasuredHeight() / txView.getMeasuredWidth() ;

        int scaleW;
        int scaleH;
        if(w > h){ //center-crop transformation
            scaleH = (int)w;
            scaleW = Math.round(w * buffer);
        } else{
            scaleH = (int)h;
            scaleW = Math.round(h * buffer);
        }

        float x = scaleW / w; //doet schaal berekenen
        float y = scaleH / h;

        mx.preScale(x, y, cX, cY); //vult preview op

        txView.setTransform(mx); //past dit op preview toe
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        //als alle permissies zijn toegestaan start camera
        if(requestCode == REQUEST_CODE_PERMISSIONS){
            if(allPermissionsGranted()){
                startCamera();
            } else{
                Toast.makeText(this, "Permissions not granted by the user.", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    private boolean allPermissionsGranted(){
        //kijken of alle permissies zijn toegestaan
        for(String permission : REQUIRED_PERMISSIONS){
            if(ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }*/

}
