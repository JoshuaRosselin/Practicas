package org.joshuarosselin.calculos;

import java.util.logging.Logger;

public class Division implements Datos {

    private static final Logger logger = Logger.getLogger(Division.class.getName());

    @Override
    public double operacion(double valor1, double valor2) {
        if (valor2 == 0) {
            logger.severe("Error: División por cero.");
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return valor1 / valor2;
    }
}
