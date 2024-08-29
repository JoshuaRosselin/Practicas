package org.joshuarosselin.test;

import org.joshuarosselin.main.Calculadora;
import org.joshuarosselin.procesos.Procesos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

class CalcuTest {

    @InjectMocks
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSuma() {
        try (MockedStatic<Procesos> mockedStatic = mockStatic(Procesos.class)) {
            mockedStatic.when(() -> Procesos.Suma(5.0f, 3.0f)).thenReturn(8.0f);

            float resultado = Procesos.Suma(5.0f, 3.0f);
            assertEquals(8.0f, resultado);
        }
    }

    @Test
    void testResta() {
        try (MockedStatic<Procesos> mockedStatic = mockStatic(Procesos.class)) {
            mockedStatic.when(() -> Procesos.Resta(5.0f, 3.0f)).thenReturn(2.0f);

            float resultado = Procesos.Resta(5.0f, 3.0f);
            assertEquals(2.0f, resultado);
        }
    }

    @Test
    void testMultiplicacion() {
        try (MockedStatic<Procesos> mockedStatic = mockStatic(Procesos.class)) {
            mockedStatic.when(() -> Procesos.Multiplicacion(5.0f, 3.0f)).thenReturn(15.0f);

            float resultado = Procesos.Multiplicacion(5.0f, 3.0f);
            assertEquals(15.0f, resultado);
        }
    }

    @Test
    void testDivision() {
        try (MockedStatic<Procesos> mockedStatic = mockStatic(Procesos.class)) {
            mockedStatic.when(() -> Procesos.Division(6.0f, 3.0f)).thenReturn(2.0f);

            float resultado = Procesos.Division(6.0f, 3.0f);
            assertEquals(2.0f, resultado);
        }
    }

    @Test
    void testDivisionPorCero() {
        try (MockedStatic<Procesos> mockedStatic = mockStatic(Procesos.class)) {
            mockedStatic.when(() -> Procesos.Division(6.0f, 0.0f)).thenThrow(new ArithmeticException("No puedo dividir por 0  :("));

            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
                Procesos.Division(6.0f, 0.0f);
            });

            assertEquals("No puedo dividir por 0  :(", exception.getMessage());
        }
    }
}
