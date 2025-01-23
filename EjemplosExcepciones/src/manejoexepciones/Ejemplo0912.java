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
public class Ejemplo0912 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            try {
                System.out.println("Ingrese el pais que desea ");
                String pais = entrada.nextLine();
                pais = pais.toLowerCase();
                
                if (pais.startsWith("a") || pais.startsWith("e") || pais.startsWith("i")
                        || pais.startsWith("o")|| pais.startsWith("u")) {
                    
                    throw new Exception("Pais Incorrecto intente de nuevo "
                            + "deberia iniciar con una consonante");
                }
                bandera = false;

            } catch (Exception a) {
                System.out.printf("Ocurrio una exepcion %s\n", a);

            }

        }
    }
}
    
            
            