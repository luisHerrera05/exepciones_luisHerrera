/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.cert.CertPathBuilderException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_95 {
     public static void main(String[] args) {
        try {
            throw new CertPathBuilderException("Error en la construcción del CertPath");
        } catch (CertPathBuilderException e) {
            e.printStackTrace();
        }
    }
}
