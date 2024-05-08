/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.JMException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeptions_65 {
     
    public static void main(String[] args) {
        try {
            throw new JMException("Error en la gestión JMX");
        } catch (JMException e) {
            e.printStackTrace();
        }
    }
}
