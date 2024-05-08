/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_71 {
    public static void main(String[] args) {
        try {
            PropertyChangeListener listener = new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    try {
                        throw new PropertyVetoException("Veto de propiedad", evt);
                    } catch (PropertyVetoException e) {
                        e.printStackTrace();
                    }
                }
            };
            // Simulando un cambio de propiedad
            listener.propertyChange(new PropertyChangeEvent(new Object(), "propiedad", null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
