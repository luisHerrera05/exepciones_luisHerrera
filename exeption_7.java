/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_7 {
    public static void main(String[] args) {
        
        try{
            
            Class.forName("clase.inexistente");
            
        } catch(ClassNotFoundException ex){
            
            System.out.println("Se lanza cuando se intenta cargar una clase que no se encuentra en el classpath.");
            
        }
        
        
        
    }
}
