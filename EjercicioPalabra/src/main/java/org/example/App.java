
/**
 * Conteo de palabras  y busqueda de la
 * palabra mas grande
 */
public class App 
{
    public static void main( String[] args ){

        String max = " ";
        String frases ="Hola Mundo, Como estamos";

        String[] pato1 = frases.split(" ");


        System.out.println("Las palabras ingresadas son: "+ frases);

        System.out.println("El numero de palabras que tebemos es: " + pato1.length);

        for (int i = 0; i < pato1.length; i++){
            if (pato1[i].length() > max.length()){
                max = pato1[i];
            }
        }

        System.out.println("La Palabra mas larga es: " + max);
    }
}
