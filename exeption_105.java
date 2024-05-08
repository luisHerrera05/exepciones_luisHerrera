/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.io.CharConversionException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_105 {
    public static void main(String[] args) {
        try {
            throw new CharConversionException();
        } catch (CharConversionException e) {
            e.printStackTrace();
        }
    }

}
