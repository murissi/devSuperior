const x = 10;

if (x > 0) {
    var a = 100;
    let b = 200;
    const c = 300;
    console.log("Imprimindo dentro do if:");
    console.log(a);
    console.log(b);
    console.log(c);

}
// variavel var nao usa mais pq vaza fora dentro do escopo.
console.log("Imprimindo fora do if:");
console.log(a);
// console.log(b);
// console.log(c);

// sempre q possivel crie um const. Isto é boa pratica
console.log("Imprimindo resultado do for: ");
    for ( let i = 0; i<=5; i++) {
        console.log(i);
    }
