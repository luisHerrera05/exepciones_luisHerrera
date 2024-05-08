/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.NoSuchProviderException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_100 {
        public static void main(String[] args) {
        try {
            throw new NoSuchProviderException("Proveedor no encontrado");
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }

}
