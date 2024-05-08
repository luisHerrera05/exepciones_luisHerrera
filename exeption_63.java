/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_63 {
    public static void main(String[] args) {
        try {
            throw new InvalidTargetObjectTypeException("Tipo de objeto de destino inválido");
        } catch (InvalidTargetObjectTypeException e) {
            e.printStackTrace();
        }
    }
}
