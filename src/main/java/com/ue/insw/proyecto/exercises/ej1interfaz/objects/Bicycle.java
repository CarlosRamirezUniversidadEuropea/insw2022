package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;


public class Bicycle extends Vehicle implements Cleanable {

    private Color color;
    private int speed;
    private int maxSpeed;
    private Brand_Bici brand_bici;
    private boolean montado;

    public Bicycle(Color color, Brand_Bici brand_bici, BigDecimal price) {
        super(price);
        this.color = color;
        this.speed = 0;
        this.maxSpeed=50;
        this.brand_bici = brand_bici;
        this.montado=false;
    }

    @Override
    public void clean() {

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color=" + color +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", brand_bici=" + brand_bici +
                ", montado=" + montado +
                '}';
    }

    public void startRiding (int speed, int maxSpeed, int time, boolean montado) {
        montado=true;
        if(montado=true) {
            if (speed<maxSpeed) {
                System.out.println("Esta conduciendo sin problema alguno");
            }else {
                System.out.println("Reduzca la velocidad por favor, no se adecua a la via");
            }
        }else {
            System.out.println("Pongase el casco y proceda a montarse en la bici");
        }
    }
}
