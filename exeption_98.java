/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.security.DigestException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_98 {
        public static void main(String[] args) {
        try {
            throw new DigestException("Error en la función de hash (Digest)");
        } catch (DigestException e) {
            e.printStackTrace();
        }
    }

}
