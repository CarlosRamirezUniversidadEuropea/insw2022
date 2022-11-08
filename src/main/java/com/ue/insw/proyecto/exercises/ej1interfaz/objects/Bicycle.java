package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import java.math.BigDecimal;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable{
    private BigDecimal price;
    public Bicycle(BigDecimal price) {
        super(price);
    }
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }
}
