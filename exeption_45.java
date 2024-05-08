/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_45 {
     public static void main(String[] args) {
          
         String str = null;
        try {
            System.out.println(str.length());
        } catch (Throwable e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }         
      }
}
