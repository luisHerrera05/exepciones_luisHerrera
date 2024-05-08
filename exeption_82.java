/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import org.xml.sax.SAXParseException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_82 {
        public static void main(String[] args) {
        try {
            throw new SAXParseException("Error en el análisis XML", null);
        } catch (SAXParseException e) {
            e.printStackTrace();
        }
    }

}
