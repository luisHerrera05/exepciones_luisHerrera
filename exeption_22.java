/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_22 {
     public static void main(String[] args) {
        
        try{
            
            int[] array = new int[-5];
            
        } catch(NegativeArraySizeException ex){
            
            System.out.println("Se lanza cuando se intenta crear un array con un tamaño negativo.");
            
        }
        
    }
}
