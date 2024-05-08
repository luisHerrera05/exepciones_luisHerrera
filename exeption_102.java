/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.crypto.ShortBufferException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_102 {
        public static void main(String[] args) {
        try {
            throw new ShortBufferException("Buffer demasiado corto");
        } catch (ShortBufferException e) {
            e.printStackTrace();
        }
    }

}
