package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
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


        Truck citroen = new Truck(Brand.CITROEN, Color.GREEN, 200, new BigDecimal(9000));
        System.out.println(citroen.getPrice());
        System.out.println(citroen.getBrand("Citroen"));
        System.out.println(citroen.getColor("Green"));
        System.out.println(citroen.toString());
        peugeot.clean();
    }
}
