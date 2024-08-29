package org.joshuarosselin.main;

import org.joshuarosselin.procesos.Procesos;
import  java.util.Scanner;
import  java.util.logging.Logger;
import java.util.logging.Level;

public class Calculadora implements Procesos{

    public Procesos procesos;

    public static void main(String [] args){
        Scanner leo = new Scanner(System.in);
        Logger logger = Logger.getLogger(Calculadora.class.getName());
        float result = 0;

        logger.info("Primer numero es?");
        float numeral1 = leo.nextFloat();
        logger.info("Que tipo de operacion deseas hacer?");
                logger.info(" Suma +, Resta -, Multiplicación x, Divicion /");
        String signo = leo.next();
        logger.info("Segundo numero es?");
        float numeral2 = leo.nextFloat();

        switch (signo){
            case "+":
                result = Procesos.Suma(numeral1, numeral2);
                break;
            case "-":
                result = Procesos.Resta(numeral1, numeral2);
                break;
            case "x":
                result = Procesos.Multiplicacion( numeral1, numeral2);
                break;
            case "/":
                result = Procesos.Division( numeral1, numeral2);
                break;
            default:
                logger.info("No reconozco esa operacion :(");
                return;
        }

       logger.info("El resultado es:" + result);

    }


    @Override
    public float num(float numeral1, float numeral2) {
        return 0;
    }
}
