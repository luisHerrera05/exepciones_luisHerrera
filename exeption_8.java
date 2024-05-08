/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_8 {
     public static void main(String[] args) {
        
        try{
            
            int edad = -5;
        
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        
            
        } catch(IllegalArgumentException ex){
            
            System.out.println("Se lanza cuando se pasa un argumento ilegal o inapropiado a un método.");
            
        }
        
        
    }
}
