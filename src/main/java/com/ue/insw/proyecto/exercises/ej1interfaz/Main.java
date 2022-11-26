package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95, 50);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        peugeot.fillCombustible(Gasoline.OCTANE_95, 50);

        Bicycle renault = new Bicycle(Brand.RENAULT, Color.RED, new BigDecimal(18000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        peugeot.fillCombustible(Gasoline.OCTANE_95, 40);

        Truck Volvo = new Truck(Brand.FORD, Color.BLUE, 100, new BigDecimal(15000));
        System.out.println(Volvo.getPrice());
        System.out.println(Volvo.getBrand());
        System.out.println(Volvo.getColor());
        System.out.println(Volvo.toString());
        Volvo.clean();
    }
}
