/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class exeption_5 {
    
     public static void main(String[] args) throws FileNotFoundException {
        
        try{
            
            FileInputStream fis = new FileInputStream("archivo.txt");
            
        }catch(FileNotFoundException ex){
            
            System.out.println("Se lanza cuando se intenta abrir un archivo que no existe.");
            
        }
            
        
    }
}
