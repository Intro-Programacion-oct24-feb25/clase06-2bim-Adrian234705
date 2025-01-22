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
        String pais; 
        boolean bandera = true; 
        String paises; 
        

        try {
            while (bandera) {
                System.out.println("Ingrese el pais que desee: ");
                paises = entrada.nextLine();
                
                char letra = paises.charAt(0); 
                if (letra == 'a'|| letra == 'e' || letra == 'i'|| letra== 'o' || letra == 'u'){
                    
                    System.out.println("El primer caracter es una vocal ingrese mas paises"); 
                }else{
                    
                    throw new Exception ("El primer caracter no es una vocal intentalo de nuevo"); 
                    
                } 
                

            }
            
        }catch (Exception e){ 
            System.out.printf("Error intentelo de nuevo: %s\n", e.getMessage()); 
            

        }
    }
}
    
            
            