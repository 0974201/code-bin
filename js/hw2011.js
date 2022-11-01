//vandaag in "ik wist niet dat mijn pastebin account er nog was", heb ik oude hw opdrachten gevonden.

//datum ophalen : Date
//var vandaag = new Date();
//var dagnummer = vandaag.getDay();
//getfullYear();
//getTime();
//var huidigedag = new Data(day);
 
var vandaag = new Date();
var dag = vandaag.getDay();
switch (dag)
{
    case 0:
    document.write("Zondag");
    break;
    
    case 1:
    document.write("Maandag");
    break;
    
    case 2:
    document.write("Dinsdag");
    break;
    
    case 3:
    document.write("Woensdag");
    break;
    
    case 4:
    document.write("Donderdag");
    break;
    
    case 5:
    document.write("Vrijdag");
    break;
    
    case 6:
    document.write("Zaterdag");
    break;
}
 
/*var vandaag = new Date();
//var dag = vandaag.getDay();
switch (dag)
{
    case 0:
    document.write("Weekend");
    break;
        
    case 6:
    document.write("Weekend");
    break;
    
    default:
    document.write("Doordeweeks");
}*/