// Dicas Exercicios

// E1;
let numeros = [5.5,7,4.23,9.1,7.3];
console.log(Math.max(...numeros)); // ... depois 

// E2;
let peso2 = 5.1;
let peso3 = 4.2; 
let peso5 = 8.1;
let mediaPonderada = ((peso2 * 2) + (peso3 * 3) + (peso5 * 5))/ (2 + 3 + 5);

console.log(mediaPonderada.toFixed(1));

// E3;
let tabuada = 6;

for(let i = 1; i<= 10; i++) {
    console.log(`${tabuada} * ${i} = ${tabuada*i}`);
}


// E4;

let entradas = [-10,0];
let numerosPositivos = 0;
let lengthPositivos = 0;
for(let i = 0; i < entradas.length; i++){
    if (entradas[i] <= 0) {

    } else {
        numerosPositivos += entradas[i];
        lengthPositivos++;
    }
}

let media = numerosPositivos / lengthPositivos;
if (media > 0) {
    console.log(media.toFixed(2)); 
} else {
    console.log("Impossivel calcular");
}

// Dentro_Fora
let valoresInteiros = [14,35,10,131,8];
let dentro = 0;
let fora = 0;

for(let i = 0; i < valoresInteiros.length; i++){
    if (valoresInteiros[i] >= 10 && valoresInteiros[i] < 20){
        dentro++;
    } else {
        fora++;
    }
}

console.log(`Dentro ${dentro}`);
console.log(`Fora ${fora}`);
