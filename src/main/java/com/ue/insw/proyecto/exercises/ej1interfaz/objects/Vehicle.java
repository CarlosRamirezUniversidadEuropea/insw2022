package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import java.math.BigDecimal;

public class Vehicle {

    private BigDecimal price;
    private Color color;

    public Vehicle(BigDecimal price, Color color) {
        this.price = price;
        this.color = color;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BigDecimal getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", color=" + color +
                '}';
    }
}
