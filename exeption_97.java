/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.cert.CertStoreException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_97 {
     public static void main(String[] args) {
        try {
            throw new CertStoreException("Excepción relacionada con el almacén de certificados");
        } catch (CertStoreException e) {
            e.printStackTrace();
        }
    }
}
