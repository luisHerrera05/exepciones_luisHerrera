/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.cert.CertPathValidatorException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_96 {
     public static void main(String[] args) {
        try {
            throw new CertPathValidatorException("Error en la validación del CertPath");
        } catch (CertPathValidatorException e) {
            e.printStackTrace();
        }
    }
}
