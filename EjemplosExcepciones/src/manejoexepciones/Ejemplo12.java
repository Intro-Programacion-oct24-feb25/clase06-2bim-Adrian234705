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

            System.out.println("Ingrese las operaciones a realizar");
            int valor = entrada.nextInt();
            int[] resultados = new int[valor];
            for (int i = 0; i < resultados.length; i++) {
                System.out.println("Ingrese el dividendo");
                int dividendo = entrada.nextInt();
                System.out.println("Ingrese el divisor");
                int divisor = entrada.nextInt();
                resultados[i] = dividendo / divisor;
            }
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s:\n Ingreso un dato de tipo cadena.", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }

    }
}
