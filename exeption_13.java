/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_13 {
      public static void main(String[] args) {
        
        try{
            
            Object obj = "programacion";
            Integer num = (Integer) obj;
            
        } catch(ClassCastException ex){
            
            System.out.println("Se lanza cuando se intenta convertir un objeto a un tipo incompatible mediante una operación de casting.");
            
        }
            
        
    }
}
