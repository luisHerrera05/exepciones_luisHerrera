/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.cert.CertificateException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_53 {
     public static void main(String[] args) {
        try {
            throw new CertificateException("Error en el certificado");
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }
}
