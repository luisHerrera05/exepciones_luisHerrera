/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_31 {
          public static void main(String[] args) {
          
        try {
            Object x = new Integer(0);
            System.out.println((String) x); // Intentando castear un Integer a String
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }         
      }

}
