/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.time.DateTimeException;
import java.time.LocalDate;
public class exeption_21 {
    
    public static void main(String[] args) {
        
        try{
            
            LocalDate.of(2004, 8, 5);
            
        } catch(DateTimeException ex){
            
            System.out.println("Se lanza cuando ocurre un error relacionado con la manipulación de objetos de fecha y hora utilizando la API de fecha y hora de Java (java.time).");
            
        }
        
        
        
    }
    
}
