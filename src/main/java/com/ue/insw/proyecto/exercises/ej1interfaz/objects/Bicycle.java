package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {



    public Bicycle(BigDecimal price) {
        super(price);
        this.price=price;
    }

     public BigDecimal getPrice(){
         BigDecimal price = null;
         return price;
     }
    @Override
    public void clean() {

    }
}
