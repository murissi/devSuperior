// const x = 20;
// const y = x.toString();

// const a = parseFloat("33.3333");
// const b = Number(a.toFixed(2)); // toFixed gerencia quantas numeros depois do ponto.


// console.log(`Valor:${x} Tipo:${typeof x}`);
// console.log(`${y} ${typeof y}`)
// console.log(`${b} ${typeof b}`)

// Funcoes de Strings 
const str = "Maria Silva ";

console.log(`const str = "Maria Silva `);

const resultado = str.toLowerCase();
console.log(`toLowerCase: ${str.toLowerCase()}`);
console.log(`toUpperCase: ${str.toUpperCase()}`);
console.log(`charAt: ${str.charAt(3)}`);
console.log(`[]: ${str[3]}`);
console.log(`replace: ${str.replace("i","$")}`);
console.log(`replace all: ${str.replace(/i/g,"$")}`);
console.log(`length ${str.length}`);
console.log(`indexOf ${str.indexOf("i")}`);
console.log(`lastIndexOf ${str.lastIndexOf("i")}`);
console.log(`substring: ${str.substring(3,8)}`);

const data = "14/10/2023";
const mes = Number(data.substring(3,5));
// pegando somente o mes
console.log(`${data.substring(3,5)}`);
console.log(`${mes} Tipo: ${typeof mes}`);

// substituindo virgula por ponto
const preco = "200,99";
const precoPadrao = Number(preco.replace(",","."));
console.log(precoPadrao);

console.log(`trim ${str.trim()}`); // remove espacos em branco; 



