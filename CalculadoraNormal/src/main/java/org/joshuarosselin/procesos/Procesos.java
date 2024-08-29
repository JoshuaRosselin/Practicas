package org.joshuarosselin.procesos;

import java.util.logging.Logger;

public interface Procesos {

    Logger logger = Logger.getLogger(Procesos.class.getName());

    float num(float numeral1, float numeral2);

    static float Suma(float numeral1, float numeral2){
        return numeral1 + numeral2;
    }

    static float Resta(float numeral1, float numeral2){
        return numeral1 - numeral2;
    }

    static float Multiplicacion(float numeral1, float numeral2){
        return numeral1 * numeral2;
    }

    static float Division(float numeral1, float numeral2){
        if (numeral2 == 0) {
            logger.severe("Error: Error Matemático");
            throw new ArithmeticException("No puedo dividir por 0  :(");
        }
        return numeral1 / numeral2;
    }
}
