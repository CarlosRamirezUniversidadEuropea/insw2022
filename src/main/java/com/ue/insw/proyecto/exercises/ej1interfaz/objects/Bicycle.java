package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {
    private BigDecimal price;
    private Color color;
    private Brand brand;

    public Bicycle(Brand brand, Color color, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void clean() {
        System.out.println("cleaning");
    }

    public String toString() {
        String sRet = "Bicycle: ";
        sRet += "Brand: " + brand + "\n";
        sRet += "Color: " + color + "\n";
        sRet += "Price: " + price + "\n";
        return sRet;
    }
}
