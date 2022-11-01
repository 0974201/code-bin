//proeftoest 2018-ish maybe? idunno anymore.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

/**
 *
 * @author 
 */

public abstract class Boek {

    private String ISBN;
    private int aantalPaginas;
    private String titel;
    private String hoofdAuteur;

    public Boek(String ISBN, int aantalPaginas, String titel, String hoofdAuteur) {
        this.ISBN = ISBN;
        this.aantalPaginas = aantalPaginas;
        this.titel = titel;
        this.hoofdAuteur = hoofdAuteur;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the aantalPaginas
     */
    public int getAantalPaginas() {
        return aantalPaginas;
    }

    /**
     * @param aantalPaginas the aantalPaginas to set
     */
    public void setAantalPaginas(int aantalPaginas) {
        this.aantalPaginas = aantalPaginas;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return the hoofdAuteur
     */
    public String getHoofdAuteur() {
        return hoofdAuteur;
    }

    /**
     * @param hoofdAuteur the hoofdAuteur to set
     */
    public void setHoofdAuteur(String hoofdAuteur) {
        this.hoofdAuteur = hoofdAuteur;
    }
    
    public abstract int tel();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Dichtbundel extends Boek {

    private ArrayList<String> gedichten;

    public Dichtbundel(String ISBN, int aantalPaginas, String titel, String hoofdAuteur) {
        super(ISBN, aantalPaginas, titel, hoofdAuteur);
        gedichten = new ArrayList<String>();
    }

    /**
     * @return the gedicht
     */
    public ArrayList<String> getGedichten() {
        return gedichten;
    }

    /**
     * @param gedicht the gedicht to set
     */
    public void setGedichten(ArrayList<String> gedichten) {
        this.gedichten = gedichten;
    }

    public void addGedicht(String gedicht) {
        this.gedichten.add(gedicht);
    }

    public int tel() {
        return getGedichten().size();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

/**
 *
 * @author 
 */
public class Roman extends Boek {

    public Roman(String ISBN, int aantalPaginas, String titel, String hoofdAuteur) {
        super(ISBN, aantalPaginas, titel, hoofdAuteur);
    }
    
    public int tel(){
        return getAantalPaginas();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Studieboek extends Boek {
    private String ondertitel;
    private ArrayList<String> nevenAuteurs;

    public Studieboek(String ISBN, int aantalPaginas, String titel, String hoofdAuteur, String ondertitel) {
        super(ISBN, aantalPaginas, titel, hoofdAuteur);
        this.ondertitel = ondertitel;
        nevenAuteurs = new ArrayList<String>();
    }
    
    /**
     * @return the ondertitel
     */
    public String getOndertitel() {
        return ondertitel;
    }

    /**
     * @param ondertitel the ondertitel to set
     */
    public void setOndertitel(String ondertitel) {
        this.ondertitel = ondertitel;
    }

    /**
     * @return the nevenAuteurs
     */
    public ArrayList<String> getNevenAuteurs() {
        return nevenAuteurs;
    }

    /**
     * @param nevenAuteurs the nevenAuteurs to set
     */
    public void setNevenAuteurs(ArrayList<String> nevenAuteurs) {
        this.nevenAuteurs = nevenAuteurs;
    }
    
     public void addNevenAuteur(String nevenAuteur) {
        this.nevenAuteurs.add(nevenAuteur);
    }
    
    public int tel(){
        return getNevenAuteurs().size();
    }
    
    public int aantalAuteurs(){
        return getNevenAuteurs().size() + 1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class StudieboekTest {
    
    Studieboek instance;
    
    public StudieboekTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Studieboek("1234567890124", 950, "Java voor beginners", "C. Horstman", "Van A tot Z");
    }
    
    /**
     * Test of aantalAuteurs method, of class Studieboek.
     */
    @Test
    public void testAantalAuteurs1() {
        System.out.println("aantalAuteurs1");
        int expResult = 1;
        int result = instance.aantalAuteurs();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of aantalAuteurs method, of class Studieboek.
     */
    @Test
    public void testAantalAuteurs2() {
        System.out.println("aantalAuteurs2");
        instance.addNevenAuteur("D. Tweedeman");
        int expResult = 2;
        int result = instance.aantalAuteurs();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of aantalAuteurs method, of class Studieboek.
     */
    @Test
    public void testAantalAuteurs3() {
        System.out.println("aantalAuteurs3");
        instance.addNevenAuteur("D. Tweedeman");
        instance.addNevenAuteur("E. Derdeman");
        int expResult = 3;
        int result = instance.aantalAuteurs();
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag1;

/**
 *
 * @author 
 */
public class Vraag1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String ISBN, int aantalPaginas, String titel, String hoofdAuteur
        Roman roman = new Roman("1234567890123", 450, "Het land van herkomst", "E. du Perron");
        Studieboek studieboek = new Studieboek("1234567890124", 950, "Java voor beginners", "C. Horstman", "Van A tot Z");
        Dichtbundel dichtbundel = new Dichtbundel("1234567890125", 30, "Nieuwe gedichten", "M. Nijhoff");
        
        studieboek.addNevenAuteur("D. Korstmann");
        dichtbundel.addGedicht("Hier ligt Poot. Hij is dood.");
        
        System.out.println(roman.tel());
        System.out.println(studieboek.tel());
        System.out.println(dichtbundel.tel());

    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag2;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Verzameling {
    private ArrayList<Geschenk> geschenken;

    public Verzameling() {
        geschenken = new ArrayList<Geschenk>();
    }    
    
    public void toevoegen(Geschenk g){
        geschenken.add(g);
    }
    
    public void nieuwGeschenk(String omschrijving, double adviesPrijs){
        Geschenk g = new Geschenk(omschrijving, adviesPrijs);
        geschenken.add(g);
    }

    public void nieuwGeschenk(String omschrijving){
        Geschenk g = new Geschenk(omschrijving, 123.45);
        geschenken.add(g);
    }

    public void nieuwGeschenk(double adviesPrijs){
        Geschenk g = new Geschenk("onbekend", adviesPrijs);
        geschenken.add(g);
    }

    public ArrayList<Geschenk> getGeschenken() {
        return geschenken;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag2;

/**
 *
 * @author THESECRETJOAMON
 */
public class Geschenk implements Comparable {

    private String omschrijving;
    private double adviesPrijs;

    public Geschenk(String omschrijving, double adviesPrijs) {
        this.omschrijving = omschrijving;
        this.adviesPrijs = adviesPrijs;
    }

    public double getAdviesPrijs() {
        return adviesPrijs;
    }

    public void setAdviesPrijs(double adviesPrijs) {
        this.adviesPrijs = adviesPrijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return omschrijving + " " + adviesPrijs;
    }

    public int compareTo(Object o) {
        Geschenk g = (Geschenk) o;
        if (this.adviesPrijs < g.adviesPrijs) {
            return -1;
        } else if (this.adviesPrijs > g.adviesPrijs) {
            return 1;
        } else {
            return 0;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag2;

import java.util.Arrays;

/**
 *
 * @author 
 */
public class Vraag2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Verzameling v = new Verzameling();
        Geschenk g1 = new Geschenk("Boek", 12.34);
        Geschenk g2 = new Geschenk("CD", 13.24);
        v.toevoegen(g1);
        v.toevoegen(g2);
        System.out.println(v.getGeschenken());

        v.nieuwGeschenk("Beide", 33.44);
        v.nieuwGeschenk("Alleen omschrijving");
        v.nieuwGeschenk(55.66);
        System.out.println(v.getGeschenken());

        Geschenk[] a = new Geschenk[4];
        a[0] = new Geschenk("A", 23.23);
        a[1] = new Geschenk("B", 13.23);
        a[2] = new Geschenk("C", 43.23);
        a[3] = new Geschenk("D", 3.23);

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getAdviesPrijs());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraag3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author 
 */
public class Vraag3 {

    private static boolean isExtreem = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Het navolgende is slechts EEN mogelijke oplossing,
        // er zijn andere / elegantere oplossingen denkbaar!
        
        JFrame jf = new JFrame();
        jf.setSize(500, 700);
        jf.setTitle("Vraag 3");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();

        p.setLayout(new GridLayout(3, 1));

        JPanel vraagPanel = new JPanel();
        vraagPanel.setLayout(new GridLayout(4, 1));
        JLabel vraag = new JLabel("Hoe vind je het weer van vandaag?");
        JRadioButton b1 = new JRadioButton("Goed");
        JRadioButton b2 = new JRadioButton("Matig");
        JRadioButton b3 = new JRadioButton("Slecht");

        class ClickListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(jf, "U koos: " + ((JRadioButton) event.getSource()).getText());
            }
        }

        ActionListener listener = new ClickListener();
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        vraagPanel.add(vraag);
        vraagPanel.add(b1);
        vraagPanel.add(b2);
        vraagPanel.add(b3);
        p.add(vraagPanel);

        JPanel butPanel = new JPanel();
        JButton toggleExtreem = new JButton("Extreem");
        JButton reset = new JButton("Reset");

        class ExtreemListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                isExtreem = !isExtreem;
                if (isExtreem) {
                    toggleExtreem.setText("Normaal");
                    b1.setText("Fantastisch!");
                    b2.setText("Geen vlees en geen vis");
                    b3.setText("Afschuwelijk…");
                } else {
                    toggleExtreem.setText("Extreem");
                    b1.setText("Goed");
                    b2.setText("Matig");
                    b3.setText("Slecht");
                }
            }
        }

        ActionListener extreemListener = new ExtreemListener();
        toggleExtreem.addActionListener(extreemListener);

        butPanel.add(toggleExtreem);
        butPanel.add(reset);

        JPanel ckPanel = new JPanel();
        ckPanel.setLayout(new GridLayout(3, 3));

        JCheckBox ckA = new JCheckBox("A");
        JCheckBox ckB = new JCheckBox("B");
        JCheckBox ckC = new JCheckBox("C");
        ckC.setSelected(true);
        JCheckBox ckD = new JCheckBox("D");
        JCheckBox ckE = new JCheckBox("E");
        ckE.setSelected(true);
        JCheckBox ckF = new JCheckBox("F");
        JCheckBox ckG = new JCheckBox("G");
        ckG.setSelected(true);
        JCheckBox ckH = new JCheckBox("H");
        JCheckBox ckI = new JCheckBox("I");
        ckPanel.add(ckA);
        ckPanel.add(ckB);
        ckPanel.add(ckC);
        ckPanel.add(ckD);
        ckPanel.add(ckE);
        ckPanel.add(ckF);
        ckPanel.add(ckG);
        ckPanel.add(ckH);
        ckPanel.add(ckI);

        class ResetListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                isExtreem = false;
                toggleExtreem.setText("Extreem");
                b1.setText("Goed");
                b2.setText("Matig");
                b3.setText("Slecht");
                bg.clearSelection();
                ckC.setSelected(true);
                ckE.setSelected(true);
                ckG.setSelected(true);
                ckA.setSelected(false);
                ckB.setSelected(false);
                ckD.setSelected(false);
                ckF.setSelected(false);
                ckH.setSelected(false);
                ckI.setSelected(false);
            }
        }

        ActionListener resetListener = new ResetListener();
        reset.addActionListener(resetListener);

        p.add(ckPanel);
        p.add(butPanel);

        jf.add(p);
        jf.setVisible(true);
    }
}
