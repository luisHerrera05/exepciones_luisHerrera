/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.IntrospectionException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_58 {
     public static void main(String[] args) {
        try {
            throw new IntrospectionException("Error de introspección");
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
