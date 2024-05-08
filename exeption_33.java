/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_33 {
       public static void main(String[] args) {
          
        try {
            Object.class.getDeclaredField("nonExistentField"); // Accediendo a un campo que no existe
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException: " + e.getMessage());
        }               
      }
}
