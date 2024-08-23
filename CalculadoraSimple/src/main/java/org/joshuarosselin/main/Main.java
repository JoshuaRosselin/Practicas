package org.joshuarosselin.main;
import org.joshuarosselin.calculos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public abstract class Main implements Datos {

    public static void main(String[] args) {

        //varianbles de dependecias necesarias como el scanner y el logger
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());

        logger.info("Ingrese el primer número:");
            double num1 = sc.nextDouble();

        logger.info("¿Qué operación desea hacer? (+, -, *, /):");
            String signo = sc.next();

        logger.info("Ingrese el segundo número:");
            double num2 = sc.nextDouble();

            //Verifica segun el signo para poder realizar la operacion.
        Datos proceso = signo.equals("+") ? new Sumar() : signo.equals("-") ? new Resta() :
                        signo.equals("*") ? new Multiplicacion() : signo.equals("/") ? new Division() : null;

        //Si no hay algun signo que corresponda no se realizara, de lo contrario si
        if (proceso != null) {
            double resultado = proceso.operacion(num1, num2);
            logger.log(Level.SEVERE, () -> "El resultado es:" + "[" +resultado+"]");
        } else {
            logger.info("Operación no válida");
        }
    }
}
