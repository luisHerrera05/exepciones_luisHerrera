/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.crypto.BadPaddingException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_93 {
    public static void main(String[] args) {
        try {
            throw new BadPaddingException("Relleno incorrecto");
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
    }
}
