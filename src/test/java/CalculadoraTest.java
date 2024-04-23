import ejemplosSueltos.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void prueba1suma() {
        assertEquals(4, Calculadora.sumar(2, 2)); // caso de prueba
    }

    @Test
    void prueba2suma() {
        assertEquals(0, Calculadora.sumar(2, -2));
    }

    @Test
    void prueba1resta() {
        assertEquals(-14000, Calculadora.restar(1000, 15000));
    }

    @Test
    void prueba2resta() {
        assertEquals(-33, Calculadora.restar(-3, 30));
    }

    @Test
    void prueba1multiplicar() {
        assertEquals(0, Calculadora.multiplicar(0,5));
    }

    @Test
    void prueba2multiplicar() {
        assertEquals(1000, Calculadora.multiplicar(1000, 1));
    }

    @Test
    void prueba1division() {
        assertEquals(0, Calculadora.dividir(0,5));
    }

    @Test
    void prueba2division() {
        assertEquals(0.1, Calculadora.dividir(1,10));
    }
}