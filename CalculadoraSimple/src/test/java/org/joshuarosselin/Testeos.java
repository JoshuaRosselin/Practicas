package org.joshuarosselin;

import org.joshuarosselin.calculos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Testeos {

    @Test
    public void testSuma() {
        Datos suma = new Sumar();
        assertEquals(5.0, suma.operacion(2.0, 3.0));
    }

    @Test
    public void testResta() {
        Datos resta = new Resta();
        assertEquals(1.0, resta.operacion(3.0, 2.0));
    }

    @Test
    public void testMultiplicacion() {
        Datos multiplicar = new Multiplicacion();
        assertEquals(6.0, multiplicar.operacion(2.0, 3.0));
    }

    @Test
    public void testDivision() {
        Datos dividir = new Division();
        assertEquals(2.0, dividir.operacion(6.0, 3.0));
    }

    @Test
    public void testDivisionPorCero() {
        Datos dividir = new Division();
        assertThrows(ArithmeticException.class, () -> dividir.operacion(6.0, 0.0));
    }

    @Test
    public void testMockito() {
        // Ejemplo de uso de Mockito
        Datos mockDatos = mock(Datos.class);
        when(mockDatos.operacion(2.0, 3.0)).thenReturn(5.0);

        assertEquals(5.0, mockDatos.operacion(2.0, 3.0));

        verify(mockDatos).operacion(2.0, 3.0);
    }
}
