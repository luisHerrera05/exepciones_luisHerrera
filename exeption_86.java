/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.lang.annotation.AnnotationFormatError;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_86 {
    public static void main(String[] args) {
        try {
            throw new AnnotationFormatError("Error en el formato de la anotación");
        } catch (AnnotationFormatError e) {
            e.printStackTrace();
        }
    }
}
