/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.berevage;

/**
 * Clase que representa una bebida de café descafeinado (Decaf).
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class Decaf extends Beverage{
    
    /**
     * Constructor de la clase Decaf.
     */
    public Decaf(){
        super("Cade Decaf");
    }

    /**
     * Obtiene el costo de la bebida Decaf.
     *
     * @return Costo de la bebida Decaf.
     */
    @Override
    public double getCosto() {
        return 40.00;
    }
    
    
    
}
