package proyectointegrador;

import java.util.Scanner;

/**
 *
 * @author Josee
 */
public class Cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String numeroBin;

        Scanner binario = new Scanner(System.in);

        do {
            System.out.print("Ingresa un número binario: ");
            numeroBin = binario.nextLine();

            if (numeroBin.isEmpty()) {
                System.out.println("Por favor ingresa un numero binario");
            }
            if(numeroBin.contentEquals("2")){
                System.out.println("Los numeros binarios solo aceptan 0 y 1");
            }

        } while (numeroBin.isEmpty() || numeroBin.contentEquals("2"));

        int resultadoDecimal = badecim(numeroBin);

        System.out.println("El número binario " + numeroBin + " es equivalente a " + resultadoDecimal + " en decimal.");

    }

    public static int badecim(String binario) {
        
        int longitud = binario.length();
        int resultado = 0;

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(binario.charAt(i));
            int potencia = longitud - i - 1;
            resultado += digito * Math.pow(2, potencia);
        }

        return resultado;
    }
}
