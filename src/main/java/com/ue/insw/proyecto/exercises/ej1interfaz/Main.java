package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        System.out.println(peugeot.getMaxSpeed());
        System.out.println(peugeot.fillCombustible(Gasoline.OCTANE_95,5));
        System.out.println(peugeot.startDriving(4,4, 5));
        peugeot.clean();

        Bicycle scott = new Bicycle( Color.BLUE, new BigDecimal(500));
        System.out.println(scott.getPrice());
        System.out.println(scott.getColor());
        System.out.println(scott.toString());
        scott.clean();

        Truck scania = new Truck(Brand.SCANIA, Color.WHITE, 110, new BigDecimal(300000));
        System.out.println(scania.getPrice());
        System.out.println(scania.getBrand());
        System.out.println(scania.getColor());
        System.out.println(scania.toString());
        scania.clean();



    }

}
