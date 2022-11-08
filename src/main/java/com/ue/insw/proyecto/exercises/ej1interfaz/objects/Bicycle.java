package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Color color;
    private BrandBicycle Brand;


    public Bicycle(BrandBicycle Brand, Color color, BigDecimal price) {
        super(Brand, color, price);
    }

    @Override
    public void clean() {

    }

    public BrandBicycle getBrand() {
        return Brand;
    }

    public Color getColor() {

        return color;
    }
}
