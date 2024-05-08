/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_19 {
      public static void main(String[] args) {
        
        try {
            
            metodoCiclado();
            
        } catch (StackOverflowError ex) {
            
            System.err.println("Esto pasa cuando se ha producido un desbordamiento de pila (StackOverflowError):");
            ex.printStackTrace();
        
        }
        
    }
    
    public static void metodoCiclado() {
        
        metodoCiclado();
        
    }
}
