package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Brand brand;

    private Color color;

    private int maxSpeed;

    private int speed;
    public Bicycle(Brand brand, Color color, int maxSpeed, BigDecimal price) {
        super(price);
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    public Bicycle(BigDecimal price) {
        super(price);
        this.price=price;
    }

     public BigDecimal getPrice(){
         BigDecimal price = null;
         return price;
     }
    public void stop() {
        this.speed = 0;
    }
    public void startriding (int speed, int time) {
        // todo Create method to start driving
        if(speed<=getMaxSpeed()){
            System.out.println("Montando en bici");
        }else{
            System.out.println("No montando en bici");
        }
    }
    @Override
    public void clean() {

    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>0){
            this.maxSpeed = maxSpeed;
        }
        System.out.println("Error, la velocidad no puede ser negativa");
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

    public int getMaxSpeed() {
        return maxSpeed;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
