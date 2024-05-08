/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
public class exeption_20 {
     public static void main(String[] args) {
        
        try{
            
            Charset charset = Charset.forName("udes_02230131070");
            
        } catch(UnsupportedCharsetException ex){
            
            System.out.println("Se lanza cuando se intenta utilizar un conjunto de caracteres (charset) no soportado por el sistema.");
            
        }
        
    }
}
