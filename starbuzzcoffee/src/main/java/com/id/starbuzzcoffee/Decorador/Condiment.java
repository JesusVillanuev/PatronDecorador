/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.Decorador;

import com.id.starbuzzcoffee.berevage.Beverage;

/**
 *
 * Clase abstracta que representa un condimento para una bebida.
 * Extiende la clase Beverage.
 * @author JESUS
 */
public abstract class Condiment extends Beverage{
    
    /**
     * Constructor de la clase Condiment.
     *
     * @param description Descripción del condimento.
     */
    public Condiment(String description) {
        super(description);
    }
    
    /**
     * Obtiene la descripción del condimento.
     *
     * @return Descripción del condimento.
     */
    public abstract String getDescription();
}
