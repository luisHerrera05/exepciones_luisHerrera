/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.naming.NamingException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_69 {
     public static void main(String[] args) {
        try {
            throw new NamingException("Error en el contexto del nombres");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
