package com.mycompany.integrador;

import java.util.Scanner;

/**
 *
 * @author Carmen Anahi Cornejo
 */
public class Integrador {

    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("tecla el valor de  a: ");
        a = obj1.nextFloat();
        System.out.println("tecla el valor de  b: ");
        b = obj1.nextFloat();
        System.out.println("tecla el valor de  c: ");
        c = obj1.nextFloat();
        double discriminante = (Math.pow(b, 2)) - (4 * a * c);
        System.out.println("Discriminante: " + discriminante);
        
        if (discriminante > 0) {
            x1 = ((-b) + (Math.sqrt(discriminante))) / (2 * a);
            x2 = ((-b) - (Math.sqrt(discriminante))) / (2 * a);
            System.out.println("Existen dos raices reales");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (discriminante == 0) {
            System.out.println("Exite una sola raiz");
            x1 = (-b) / (2 * a);
            System.out.println("x1: " + x1);
        } else {
            System.out.println("No tiene raices reales, pertenecen a numeros complejos.");
        }

    }
}
