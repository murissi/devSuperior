// Arrays 
const valores = ["Maria",37,false,1.64]; // arrays são como listas no python
const t1 = valores.length; // tamanho arrays

console.log(t1);

// Removendo elementos
const nomes = ["Maria","Joao","Ana","Marcos"];
const r1 = nomes.pop(); // remove o utimo elemento e imprime
const r2 = nomes.shift(); // remove o primeiro e imprime;
console.log(r1);
console.log(r2);
console.log(nomes);

// Inserindo elementos

const alturas = [1.65,1.82,1.7];
alturas.push(1.75); // Adiciona no final
alturas.unshift(1.82); // Insere no comeco

console.log(alturas);

// Inserir e remover de qualquer lugar
const letras = ["A","B","C","D","E","F"];
letras.splice(2, 3, "X","Y"); // a partir da posicao 2 removeu 3 elementos
// inseriu x e y
console.log(letras);

letras.splice(2,0,"Z","Z") // Nao removeu ninguem, e apartir da posicao 
// adicionou dois Z;
console.log(letras);

// Concatenar arrays 

const meninas = ["Maria","Ana"];
const meninos = ["Joao", "Marcos"];

const todos = meninas.concat(meninos);
console.log(todos);

// Acesso e atribuicao
const idades = [20,30,40,50];

idades[1] = 38;

console.log(idades);

for(let i = 0; i < idades.length; i++) {
    console.log(idades[i]);
}

// for each
const frutas = ["Maca","Pera","Banana","Uva"];
frutas.forEach(i => {
    console.log(i);
}) 

