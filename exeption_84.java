/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.xml.xpath.XPathException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_84 {
     public static void main(String[] args) {
        try {
            throw new XPathException("Error en la expresión XPath");
        } catch (XPathException e) {
            e.printStackTrace();
        }
    }
}
