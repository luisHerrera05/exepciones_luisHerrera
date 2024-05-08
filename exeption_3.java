/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_3 {
    public static void main(String[] args) {
       
        try{
            
            int[] array = new int[3];
            System.out.println(array[5]);
            
        }catch(ArrayIndexOutOfBoundsException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un índice fuera del rango válido de un array.");
            
        }
    }
}
