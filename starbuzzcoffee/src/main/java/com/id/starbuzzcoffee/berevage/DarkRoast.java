/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.berevage;

/**
 * Clase que representa una bebida de café Dark Roast.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class DarkRoast extends Beverage{
    
    /**
     * Constructor de la clase DarkRoast.
     */
    public DarkRoast(){
        super("Cafe Dark Roast");
    }

    /**
     * Obtiene el costo de la bebida Dark Roast.
     *
     * @return Costo de la bebida Dark Roast.
     */
    @Override
    public double getCosto() {
        return 35.00;
    }
    
    
    
}
