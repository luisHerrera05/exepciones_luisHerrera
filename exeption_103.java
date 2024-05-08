/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.nio.charset.CharacterCodingException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_103 {
    public static void main(String[] args) {
        try {
            throw new CharacterCodingException();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
    }
}
