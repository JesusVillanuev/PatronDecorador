/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.Decorador;

import com.id.starbuzzcoffee.berevage.Beverage;

/**
 * Clase que representa un condimento de chocolate para una bebida.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class Chocolate extends Beverage{
    Beverage beverage;
    
    /**
     * Constructor de la clase Chocolate.
     *
     * @param beverage Bebida a la que se le agrega chocolate.
     */
    public Chocolate(Beverage beverage){
        super(beverage.getDescription()+", chocolate");
        this.beverage= beverage;
    }
    
    /**
     * Obtiene el costo total de la bebida con el condimento de chocolate.
     *
     * @return Costo total de la bebida con chocolate.
     */
    @Override
    public double getCosto() {
        return beverage.getCosto()+.20 ;
    }
    
    /**
     * Obtiene la descripción de la bebida con el condimento de chocolate.
     *
     * @return Descripción de la bebida con chocolate.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", chocolate";
    }
    
    
}
