package prueba;

public class RandomText {

    // Conjunto de caracteres
        char[] caracteres = {
        'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3',
        '4', '5', '6', '7', '8', '9', '!', '#', '$', '%', '&', '/', '(', ')',
        '='
    };

    // Constructor que genera el texto aleatorio
    public RandomText(Integer longitud) {
        char[] textoRandom = new char[longitud];

        for (Integer i = 0; i < longitud; i++) {
            Integer Aleatorio = i * (i + longitud) % caracteres.length;
            textoRandom [i] = caracteres[Aleatorio];
        }

        // Imprimir el texto generado
        System.out.println("[" + new String(textoRandom) + "]");
    }

    public static void main(String[] args) {
        Integer longitud = 2;
        new RandomText(longitud);
    }
}
