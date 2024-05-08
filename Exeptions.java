/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class Exeptions {

      public static void main(String[] args) {
        
        try {
            
            double div = 4 / 0;
            System.out.println("La división es: " + div);
            
        } catch (ArithmeticException ex) {
            
            System.out.println("Error: No se puede dividir por cero");
            
        }
        
    }
    
}


