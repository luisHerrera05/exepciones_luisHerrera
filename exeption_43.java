/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_43 {
      public static void main(String[] args) {
         
        try {
            Object[] objects = new Integer[5];
            objects[0] = "world"; // Intentando almacenar un tipo de objeto incompatible en un arreglo de tipos específicos
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
        }          
    }
}
