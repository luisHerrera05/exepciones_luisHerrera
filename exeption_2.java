/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_2 {
      public static void main(String[] args) {
        
        String str = null;
        
        try{
            
            System.out.println(str.length());
            
        }catch(NullPointerException ex){
            
            System.out.println("Se lanza cuando se intenta acceder o invocar un método en un objeto que es null.");
            
        }
            
        
    }
}
