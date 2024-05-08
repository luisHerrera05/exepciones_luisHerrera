/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_46 {
    public static void main(String[] args) {
          
        int[] arr = {6, 9, 3};
        try {
            System.out.println(arr[5]);
        } catch (Throwable e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }               
      }
}
