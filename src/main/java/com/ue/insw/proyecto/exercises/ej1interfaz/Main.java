package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(BrandVehicle.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
    }
}
