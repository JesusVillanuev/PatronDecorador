/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.id.starbuzzcoffee.berevage;

/**
 * Clase abstracta que representa una bebida.
 * @author JESUS
 */
public abstract class Beverage {
    
    private String description;
    
    /**
     * Constructor de la clase Beverage.
     *
     * @param descripcion Descripción de la bebida.
     */
    public Beverage(String descripcion){
        this.description=descripcion;
    }
    
    /**
     * Obtiene la descripción de la bebida.
     *
     * @return Descripción de la bebida.
     */
    public String  getDescription(){
        return description;
    }
    
    /**
     * Método abstracto para obtener el costo de la bebida.
     *
     * @return Costo de la bebida.
     */
    public abstract double getCosto();
}
