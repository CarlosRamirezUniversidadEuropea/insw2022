package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        peugeot.setMaxSpeed(-50);
        System.out.println(peugeot.getMaxSpeed());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Car audi = new Car(Brand.AUDI, Color.BLACK, 200, new BigDecimal(15000));

        System.out.println("color del audi:" + audi.getColor());

        Truck truck = new Truck();
        Bicycle bicycle = new Bicycle(new BigDecimal(1000));
    }
}
