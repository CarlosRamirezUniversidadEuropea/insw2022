package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandTruck;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandVehicle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //Coche
        Car peugeot = new Car(BrandVehicle.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        //Bicicleta
        Bicycle bmc = new Bicycle(BrandBicycle.BMC, Color.RED, 70, new BigDecimal(3000));
        System.out.println(bmc.getPrice());
        System.out.println(bmc.getBrand());
        System.out.println(bmc.getColor());
        System.out.println(bmc.toString());
        bmc.clean();
        //Tractor
        Truck ford = new Truck(BrandTruck.FORD, Color.YELLOW, 35, new BigDecimal(45000));
        System.out.println(ford.getPrice());
        System.out.println(ford.getBrand());
        System.out.println(ford.getColor());
        System.out.println(ford.toString());
        ford.clean();
    }
}
