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
        System.out.println(peugeot.toString());
        peugeot.clean();

        Truck truck=new Truck(new BigDecimal(90000));
        System.out.println(truck.toString());
        System.out.println(truck.getPrice());
        System.out.println(truck.getBrand());
        System.out.println(truck.getColor());

        Bicycle bicycle=new Bicycle(new BigDecimal(1000));
        System.out.println(bicycle.toString());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getBrand());
        System.out.println(bicycle.getColor());

    }
}
