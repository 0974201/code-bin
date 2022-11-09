//vars
let a = 0;
let b = "naam";
const c = 1; //wordt voornamelijk gebruikt voor getElementById, final

let array = ["aaa","bbb","ccc","ddd","eee"];

console.log(array[1]);
array.push("fff");
array[0] = "zzz";

for(let i = 0; i < array.length; i++){
    //console.log(`Hallo ${i}`.toLowerCase());
    //console.log(`Hallo ${i}`.toUpperCase());
    console.log(`Hallo ${array[i]}`);
}

let firstLetter = b.charAt(0);
let restOfName = b.substring(1);
console.log(firstLetter.toUpperCase() + restOfName);

const obj = [{voornaam: "aaa", achternaam: "bbb"}] //obj
console.log(`Hallo ${obj[0].voornaam}`);

function showName(name){
    console.log(`Hello ${name}`);
}

function caplitalise(name){
    let firstLetter = name.charAt(0);
    let restOfName = name.substring(1);
    return firstLetter.toUpperCase() + restOfName;
}


showName("aaa");
console.log(caplitalise("bbb"));