package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;
import java.util.Vector;


public class Main {




    public static void main(String[] args) {
        Car car1 = new Car(Brand.FORD, Color.BLACK, 140,  Gasoline.GASOLEO_A, 50, 20, new BigDecimal(14000));
        Truck track1 =new Truck(Brand.PEUGEOT, Color.BLACK, 120, Gasoline.OCTANE_98, 60, 20, 26000, new BigDecimal(12000));
        Bicycle bicycle1 = new Bicycle(new BigDecimal(2000));

        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getMaxSpeed());
        System.out.println(car1.getTipoGasoline());
        System.out.println(car1.getLitrosTotales());
        System.out.println(car1.getLitrosActuales());
        System.out.println(car1.getPrice());
        car1.clean();
    }
}
