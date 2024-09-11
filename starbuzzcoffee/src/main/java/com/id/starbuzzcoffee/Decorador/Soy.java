/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.Decorador;

import com.id.starbuzzcoffee.berevage.Beverage;

/**
 * Clase que representa un condimento de soya para una bebida.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public class Soy extends Beverage{
    Beverage beverage;
    
    /**
     * Constructor de la clase Soy.
     *
     * @param beverage Bebida a la que se le agrega soya.
     */
    public Soy(Beverage beverage){
        super(beverage.getDescription()+", soy");
        this.beverage=beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento de soya.
     *
     * @return Descripción de la bebida con soya.
     */
    @Override
    public double getCosto() {
        return beverage.getCosto()+.25;
    }
    
    /**
     * Obtiene el costo total de la bebida con el condimento de soya.
     *
     * @return Costo total de la bebida con soya.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", soy";
    }
    
    
    
}
