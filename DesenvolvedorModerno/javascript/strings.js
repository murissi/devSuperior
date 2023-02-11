// Strings 
/*
console.log("String Literal com aspas duplas");
console.log("String Literal com aspas simples");
console.log(`String Literal com crases`);

console.log("Concatenação e interpolação");
console.log();
console.log("Valor do produto é " + num);
console.log(`Valor do produto é ${num}`);
*/

const num = 14.5;
console.log("Conversao entre number e string");
console.log();

const str1 = num.toString();
console.log(`Tipo de ${str1} é ${typeof str1}`);

const str2 = num.toFixed(2);
console.log(`Tipo de ${str2} é ${typeof str2}`);

const num1 = Number("14.5");
console.log(`Tipo de ${num1} é ${typeof num1}`);

const num2 = parseInt("21", 10);
console.log(`Tipo de ${num2} é ${typeof num2}`);


const num3 = parseInt("21", 16);
console.log(`Tipo de ${num3} é ${typeof num3}`);

const num4 = parseFloat("21.34", 10);
console.log(`Tipo de ${num4} é ${typeof num4}`);