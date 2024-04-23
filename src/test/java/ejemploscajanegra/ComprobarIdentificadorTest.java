package ejemploscajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {

    // declaramos el objeto de la clase
    ComprobarIdentificadorTest cID = new ComprobarIdentificadorTest();

    @Test
    @DisplayName("Cobertura 1, 4, 6, 9, 11 - identificador válido")
    void validarIdentificador1() {
        cID.setIdentificador("Progra--mador-1");
        assertTrue(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 2 - longitud <= 4")
    void validarIdentificador2() {
        cID.setIdentificador("Prog");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 3 - longitud >= 16")
    void validarIdentificador3() {
        cID.setIdentificador("Progra--mador-112");
        assertFalse(cID.validarIdentificador());
    }
}