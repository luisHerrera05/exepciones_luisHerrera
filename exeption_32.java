/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_32 {
    public static void main(String[] args) {
          
        try {
            int result = 5 / 0; // División por cero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }         
      }
}
