/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego Antonio Badillo Morales
 */
public class Problema_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal entero: ");

        int numero = sc.nextInt();

        // Convertimos el número decimal a binario
        String binario = Integer.toBinaryString(numero);

        // Si el número es negativo, aplicamos el método de complemento a2
        if (numero < 0) {
            // Añadir un 1 al principio
            binario = "1" + binario;

            // Completamos el binario con ceros hasta que tenga la misma longitud que el complemento a2
            for (int i = binario.length(); i < 32; i++) {

                binario = "0" + binario;
            }
        }
        if (numero == 0) {
            binario = "0";
        }

        System.out.println("El número binario es: " + binario);
    }
}
