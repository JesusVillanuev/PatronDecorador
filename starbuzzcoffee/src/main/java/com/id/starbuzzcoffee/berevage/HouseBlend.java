/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.berevage;

/**
 * Clase que representa una bebida de café House Blend.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class HouseBlend extends Beverage{
    
    /**
     * Constructor de la clase HouseBlend.
     */
    public HouseBlend(){
        super("Cafe House Blend");
    }
    
    /**
     * Obtiene el costo de la bebida House Blend.
     *
     * @return Costo de la bebida House Blend.
     */
    @Override
    public double getCosto() {
       return 50.00;
    }

    
    
}
