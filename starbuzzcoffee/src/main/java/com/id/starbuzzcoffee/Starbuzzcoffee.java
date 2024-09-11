/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.id.starbuzzcoffee;

import com.id.starbuzzcoffee.Decorador.Chocolate;
import com.id.starbuzzcoffee.Decorador.Milk;
import com.id.starbuzzcoffee.Decorador.Soy;
import com.id.starbuzzcoffee.berevage.Beverage;
import com.id.starbuzzcoffee.berevage.Expresso;
import com.id.starbuzzcoffee.berevage.HouseBlend;

/**
 *
 * @author JESUS
 */
public class Starbuzzcoffee {

    public static void main(String[] args) {
        Beverage espresso = new Expresso();
        Beverage houseBlend = new HouseBlend();

        // Agregar condimentos
        espresso = new Milk(espresso);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Chocolate(houseBlend);

        // Obtener descripciones y costos
        System.out.println("Descripción del Espresso: " + espresso.getDescription());

        System.out.println("Descripción del House Blend: " + houseBlend.getDescription());
    }
}
