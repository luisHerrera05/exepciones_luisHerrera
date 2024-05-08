/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.cert.CertificateExpiredException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_92 {
    public static void main(String[] args) {
        try {
            // Simulación de un certificado vencido
            throw new CertificateExpiredException("El certificado ha caducado");
        } catch (CertificateExpiredException e) {
            e.printStackTrace();
        }
    }

}
