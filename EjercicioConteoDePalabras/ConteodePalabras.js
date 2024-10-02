let max = "";  
let frases = "Hola Mundo, Como estamos";

let pato1 = frases.split(" ");
let sumaLongitudes = 0;

console.log("Las palabras ingresadas son: " + frases);
console.log("El número de palabras que tenemos es: " + pato1.length);

for (let i = 0; i < pato1.length; i++) {
    if (pato1[i].length > max.length) {
        max = pato1[i];
    }
    sumaLongitudes += pato1[i].length; 
}

let longitudMedia = sumaLongitudes / pato1.length;

console.log("La palabra más larga es: " + max);
console.log("La longitud media de las palabras es: " + longitudMedia.toFixed(2))

