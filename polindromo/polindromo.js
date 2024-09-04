//Parte para leer datos del usuario en terminal
const readline = require('readline');

const leo = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

//Array de palabras predefinidas
const polindromos = ['ana', 'rapar', 'salas', 'seres', 'oso', 'solos'];


//trabajo donde se verifica las palabras ya sea en el array o si no esta verifica
leo.question("Ingrese la palabra: ", (input) => {

    //palabras que no se encuntra en el array
    var otraPalabra = input.replace(/ /g, "").split('').reverse().join('');
    var igual = otraPalabra;
  
    
    if ((polindromos.includes(input)) || (input.replace(/ /g, "") === igual)) {
        console.log(input + ", es una palabra polindroma " + otraPalabra);
    } else {
        console.log(input + ", no es una palabra polindroma " + otraPalabra);
    }

    leo.close();
});
