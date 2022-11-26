package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck {
    private BigDecimal price;
    private Brand brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;

    public Truck(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super();
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.status = Status.ON;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void clean() {
        System.out.println("Clean");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public String toString() {
        String sRet = "Bicycle: ";
        sRet += "Brand: " + brand + "\n";
        sRet += "Color: " + color + "\n";
        sRet += "Max Speed : " + maxSpeed + "\n";
        sRet += "Speed: " + speed + "\n";
        sRet += "Status: " + status + "\n";
        return sRet;
    }

}
