/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.GeneralSecurityException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_55 {
    public static void main(String[] args) {
        try {
            throw new GeneralSecurityException("Error de seguridad general");
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
