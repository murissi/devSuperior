// console.log(`3 + 4 ${3+4}`);
// console.log(`3 - 4 ${3-4}`);
// console.log(`3 * 9 ${3*9}`);
// console.log(`$19 / 3 ${19/5}`);
// console.log(`19 % 3 ${19%5}`);
// console.log(`3 ** 4 ${3**4}`);

console.log("3" == 3);

// Operadores Comparativos de igualdade
// console.log(`${"" == false}`);
// console.log(`${"" === false}`);
// console.log(`${"17" == 17}`);
// console.log(`${"17" === 17}`);

const x = "Maria";
const y = "Maria";
const a = new String("Maria");
const b = new String("Maria");

console.log(x === y);
console.log(a === b);
console.log(typeof x);
console.log(typeof a);

// operadores logicos
// && = e
// || = ou
// ! = nao

// Estrutura de controle
const time = 10;
if (time < 12) {
    console.log("Boa dia");
} 
else if (time < 18) {
    console.log("Boa tarde");

} else {
    console.log("Boa noite");
} 

const week = 3;
switch (week) {
    case 1:
        console.log("Domingo");
        break;

    case 2:
        console.log("Segunda");
        break;

    case 3:
        console.log("Terça");
        break;

    case 4:
        console.log("Quarta");
        break;

    case 5:
        console.log("Quinta");
        break;

    case 6:
        console.log("Sexta");
        break;

    case 7:
        console.log("Sabado");
        break;

    default:
        console.log("Invalido")
    }

    let count = 4;
    while(count > 0) {
        console.log(`COUNT = ${count}`);
        count--;
    }

    for(let i = 0; i < 4; i++) {
        console.log(`I = ${i}`);
    }

    let test = 4;
    
    do {
        console.log(`Test = ${test}`);
        test--;
    } while (test > 0);