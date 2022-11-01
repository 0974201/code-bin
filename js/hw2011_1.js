var tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dignissim tempus nulla, sed tempor elit commodo vel. Suspendisse vel ex sed enim interdum vulputate. Integer dictum, risus ut mattis rutrum, felis urna egestas quam, faucibus efficitur sapien nisl sed leo.";
 
len = tekst.length;
spaties = 0;
klinkera = 0;
klinkere = 0;
klinkeri = 0;
klinkero = 0;
klinkeru = 0;
 
for (x = 0; x < len; x++)
{
    teken = tekst.charAt(x);
    document.write(teken);
    if (teken === " "){
        spaties++;
    }
    
    if (teken === "a"){
        klinkera++;
    }
    
    else if (teken === "e"){
        klinkere++;
    }
    
    else if (teken === "i"){
        klinkeri++;
    }
    
    else if (teken === "o"){
        klinkero++;
    }
    
    else if (teken === "u"){
        klinkeru++;
    }
}

document.write("<br/><br>Aantal spaties in deze tekst is: " + spaties + ".");
document.write("<br/>Aantal a's in deze tekst is: " + klinkera + ".");
document.write("<br/>Aantal e's in deze tekst is: " + klinkere + ".");
document.write("<br/>Aantal i's in deze tekst is: " + klinkeri + ".");
document.write("<br/>Aantal o's in deze tekst is: " + klinkero + ".");
document.write("<br/>Aantal u's in deze tekst is: " + klinkeru + ".");