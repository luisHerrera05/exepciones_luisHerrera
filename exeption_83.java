/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.xml.stream.XMLStreamException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_83 {
    public static void main(String[] args) {
        try {
            throw new XMLStreamException("Error en el flujo XML");
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
