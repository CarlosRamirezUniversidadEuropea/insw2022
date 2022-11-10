package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Truck Volvo = new Truck(new BigDecimal(15000));
        System.out.println(Volvo.getPrice());
        Volvo.clean();

        Bicycle cannondale = new Bicycle(BrandBicycle.CANNONDALE, Color.WHITE, new BigDecimal(1000));
        System.out.println(cannondale.getPrice());
        System.out.println(cannondale.getBrand());
        System.out.println(cannondale.getColor());
        System.out.println(cannondale.toString());
        cannondale.clean();
    }
}
