/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class exeption_11 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        
        
        try{
            
            int num = scanner.nextInt();
            System.out.println(num);
            
        } catch(InputMismatchException ex){
            
            System.out.println("Este error aparece cuando se ha declarado que la variable es de un tipo y se ingresa un dato de otro tipo.");
            
        }
        
    }
}
