/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import org.xml.sax.SAXException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_75 {
     public static void main(String[] args) {
        try {
            throw new SAXException("Error en el análisis SAX");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
