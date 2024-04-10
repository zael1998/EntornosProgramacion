
import java.util.Arrays;
import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // pido un número
        int numero = teclado.nextInt(); teclado.nextLine(); // ejemplo: 3
        // si es != 0. entro en bucle hasta que introduzca un 0
        while (numero != 0) {
            String cadena = teclado.nextLine(); // ejemplo: "1 3 6"
            // lo tengo que "trocear"
            String[] numeros = cadena.split(" ");
            System.out.println(Arrays.toString(numeros));
            //....

            // antes de salir pedir el siguiente número
            numero = teclado.nextInt(); teclado.nextLine();
        }
    }
}