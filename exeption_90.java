/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_90 {
     public static void main(String[] args) {
        try {
            throw new VirtualMachineError("Error de la máquina virtual") {};
        } catch (VirtualMachineError e) {
            e.printStackTrace();
        }
    }   
}
