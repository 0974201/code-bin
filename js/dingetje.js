const header = document.getElementById("title"); //zoekt element met id naam
console.log(header.innerHTML);
header.innerHTML = "Mijn uitgaven"; //veranderd inhoud van element

const headers = document.getElementsByTagName("h2"); //zoekt html elementen met de tagname; geeft een lijst terug
console.log(headers[0].innerHTML);

const altHeader = document.querySelector("h2#title"); //zoekt css elementen
altHeader.innerHTML = "Al mijn uitgaven";

const allItems = document.getElementsByClassName("bon"); //geeft lijst terug

const altItems = document.querySelectorAll(".bon"); //geeft lijst terug + css elementen


let sum = 0;

for(let i = 0; i < altItems.length; i++){
    console.log(altItems[i].innerHTML);
    let n = parseFloat(allItems[i].innerHTML); //string -> getal
    sum += n;
}

console.log(sum);

const totaal = document.getElementById("total");
totaal.innerHTML = `Totaal: ${sum}`;