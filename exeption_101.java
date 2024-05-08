/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_101 {
    public static void main(String[] args) {
        try {
            throw new NoSuchAlgorithmException("Algoritmo no encontrado");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    } 
}
