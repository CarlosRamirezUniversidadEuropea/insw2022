package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95, 50);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.fillCombustible(Gasoline.OCTANE_95, 50);
        peugeot.clean();

        Truck Volvo = new Truck(BrandTruck.VOLVO, Color.WHITE, 100, new BigDecimal(15000));
        System.out.println(Volvo.getPrice());
        System.out.println(Volvo.getBrand());
        System.out.println(Volvo.getColor());
        System.out.println(Volvo.toString());
        Volvo.clean();

        Bicycle cannondale = new Bicycle(BrandBicycle.CANNONDALE, Color.RED, new BigDecimal(1000));
        System.out.println(cannondale.getPrice());
        System.out.println(cannondale.getBrand());
        System.out.println(cannondale.getColor());
        System.out.println(cannondale.toString());
        cannondale.clean();
    }
}
