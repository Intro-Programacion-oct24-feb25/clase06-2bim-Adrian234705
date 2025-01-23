/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    public static void main(String[] args) {
       try {
           Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese las operaciones que quiere realizar");
            int valor = entrada.nextInt();
            int[] resultados = new int[valor];
            String cadena = "Resultado de las operaciones\n";
            for (int i = 0; i < resultados.length; i++) {
                System.out.println("Division #" + (i + 1));
                System.out.println("Ingrese el dividendo");
                int dividendo = entrada.nextInt();
                System.out.println("Ingrese el divisor");
                int divisor = entrada.nextInt();
                resultados[i] = dividendo / divisor;
            }
            for (int i = 0; i < resultados.length; i++) {
                cadena = String.format(cadena + "\nDivision #" + (i+1) +"\n"+ resultados[i]);
            }

        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s:\n Ingreso un dato que no corresponde.", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }

    }
}
