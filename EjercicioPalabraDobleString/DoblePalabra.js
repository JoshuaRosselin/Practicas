var palabra1 = "carro";
var palabra2 = "perro";

var repetidas = "";
var diferentes = "";

for (var i = 0; i < palabra1.length; i++) {
    var letra = palabra1[i];
    if (palabra2.includes(letra) && !repetidas.includes(letra)) {
        repetidas += letra;
    }
}

for (var i = 0; i < palabra1.length && palabra2.length; i++) {
    var letra = palabra1[i];
    if (!palabra2.includes(letra) && !diferentes.includes(letra)) {
        diferentes += letra;
    }

    for (var j = 0; j < palabra2.length; j++) {
        var letra = palabra2[j];
        if (!palabra1.includes(letra) && !diferentes.includes(letra)) {
            diferentes += letra;
        }
    }

}

console.log("Letras que se repiten son: " + repetidas);
console.log("Letras que son diferentes, son: " + diferentes);
