/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.Decorador;

import com.id.starbuzzcoffee.berevage.Beverage;

/**
 * Clase que representa un condimento de crema batida para una bebida.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class WhippedCream extends Beverage{
    Beverage beverage;
    
    /**
     * Constructor de la clase WhippedCream.
     *
     * @param beverage Bebida a la que se le agrega crema batida.
     */
    public WhippedCream(Beverage beverage){
        super(beverage.getDescription()+", whippedCream");
        this.beverage=beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento de crema batida.
     *
     * @return Descripción de la bebida con crema batida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+", whippedCream";
    }

    /**
     * Obtiene el costo total de la bebida con el condimento de crema batida.
     *
     * @return Costo total de la bebida con crema batida.
     */
    @Override
    public double getCosto() {
        return beverage.getCosto()+.15;
    }
    
    
    
}
