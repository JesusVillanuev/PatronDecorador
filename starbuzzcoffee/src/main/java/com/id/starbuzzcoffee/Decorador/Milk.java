/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.Decorador;

import com.id.starbuzzcoffee.berevage.Beverage;

/**
 * Clase que representa un condimento de leche para una bebida.
 * Extiende la clase Condiment.
 * @author JESUS
 */
public class Milk extends Condiment{
    Beverage beverage;
    
    /**
     * Constructor de la clase Milk.
     *
     * @param beverage Bebida a la que se le agrega leche.
     */
    public Milk(Beverage beverage){
        super(beverage.getDescription()+ ", milk");
        this.beverage=beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento de leche.
     *
     * @return Descripción de la bebida con leche.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", milk";
    }

    /**
     * Obtiene el costo total de la bebida con el condimento de leche.
     *
     * @return Costo total de la bebida con leche.
     */
    @Override
    public double getCosto() {
        return beverage.getCosto()+.15;
    }
    
    
}
