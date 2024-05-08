/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.awt.datatransfer.MimeTypeParseException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_68 {
     public static void main(String[] args) {
        try {
            throw new MimeTypeParseException("Error al analizar el tipo MIME");
        } catch (MimeTypeParseException e) {
            e.printStackTrace();
        }
    }
}
