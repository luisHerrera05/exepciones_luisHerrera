/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_16 {
     public static void main(String[] args) {
        
        try{
        
            Object[] array = new Integer[10];
            array[0] = "lista";
        
        } catch(ArrayStoreException ex){
            
            System.out.println("Se lanza cuando se intenta almacenar un objeto de un tipo incompatible en un array de tipo primitivo.");
            
        }
            
    }
}
