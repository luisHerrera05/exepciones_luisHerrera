/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */

import java.io.IOException;
import java.lang.reflect.Method;
public class exeptions_17 {
    public static void main(String[] args) throws IOException {
        
        try{
        
            Class<?> clase = String.class;
            Method metodo = clase.getMethod("metodoInexistente");
        
        } catch(NoSuchMethodException ex){
            
            System.out.println("Se lanza cuando intentas acceder a un método que no existe en una clase.");
            
        }    
    }
}
