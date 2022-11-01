//context; dit had ik een paar jaar geleden voor een klasgenoot geschreven als extra uitleg over de basics van javascript.

//note: ik gebruikt JS hier, geen ES!
//gebruik repl.it/languages/javascript om dit te runnen als je Visual Studio Code nog niet hebt geïnstalleerd~

//todo: geef alles een logische naam 
//^ (als dit er nog staat tegen de tijd dat ik dit geshared heb, pls doe mij niet na en geef alles een logische, beschrijvende naam)

//globale variabelen
const a = "Hello world"; //een string, kan niet veranderd worden
let b = 1337; //een integer/number
let c = true; //een bool

a = "yolo"; //geeft een error terug omdat je een const probeert te veranderen

console.log(a);

function d(){ //een functie, vanille smaak
    //lokale variabelen
    let b = " Goodbye world"; //deze variabele bestaat alleen in deze functie! 
    console.log(`${a + b}`);
}

d(); //vergeet tijdens het aanroepen van een functie de () niet!
console.log(b); //ongewijzigd omdat deze b een globale variabele is

function e(x, y){ //in ES6 zou dit x: string, y: number zijn. maar omdat ik JS gebruik hoeft dit niet.
    //eigenlijk, omdat ik nu JS gebruik kan ik alles in de parameters proppen 
    return x * y
}

var lol = e("Twee", 3); //oops
console.log(lol)


