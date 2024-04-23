package ejemploscajanegra;
import java.util.Arrays;
 public class ComprobarIdentificador {

    private String identificador;

    // constructor sin parámetros

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    private boolean validarLongitud() {
        if (identificador.length() > 15 || identificador.length() < 5) {
            return false;
        } else {
            return true;
        }
    }

    private boolean validarJuegoDeCaracteres() {
        for (int i = 0; i < identificador.length(); i++) {
            char c = identificador.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' ) {
                return false;
            }
        }
        return true;
    }

    private boolean validarPosicionGuion() {
        if (identificador.contains("-")) {
            if (identificador.charAt(0) == '-' || identificador.charAt(identificador.length() - 1) == '-') {
                return false;
            }
        }
        return true;
    }

    private boolean validarAlMenosUnaLetra() {
        for (int i = 0; i < identificador.length(); i++) {
            if (Character.isLetter(identificador.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean validarNoEsPalabraReservada() {
        String[] palabrasReservadas = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
        };

        return !Arrays.stream(palabrasReservadas).anyMatch(pr -> pr.equals(identificador));
    }

    public boolean validarIdentificador() {
        if (validarLongitud() && validarJuegoDeCaracteres() && validarPosicionGuion() && validarAlMenosUnaLetra() && validarNoEsPalabraReservada()) {
            return true;
        } else {
            return false;
        }
    }

}