/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.berevage;

/**
 * Clase que representa una bebida de café Espresso.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class Expresso extends Beverage{
    
    /**
     * Constructor de la clase Espresso.
     */
    public Expresso(){
        super("Cafe Expresso");
    }

    /**
     * Obtiene el costo de la bebida Espresso.
     *
     * @return Costo de la bebida Espresso.
     */
    @Override
    public double getCosto() {
        return 45.00;
    }
    
    
}
