package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95, 50 );
        Bicycle bicycle= new Bicycle(new BigDecimal(1000), 60,BicyBrand.CANNONDALE, Color.WHITE);
        Truck truck=new Truck(new BigDecimal(50000),10000, TrukBrand.FORD, Color.LIGHT_GREY);
        System.out.println("MUESTRO POR PANTALLA LOS TRES TO STRING");
        System.out.println(peugeot.toString());
        System.out.println(bicycle.toString());
        System.out.println(truck.toString());
        System.out.println("----------------------------------------");
        System.out.println("Fill Combustible".toUpperCase());
        peugeot.fillCombustible(Gasoline.OCTANE_95, 40);
        System.out.println("----------------------------------------");
        System.out.println("Start Driving".toUpperCase());
        peugeot.startDriving(40);
        System.out.println("----------------------------------------");
        System.out.println("Cambio el max speed del peugeot.".toUpperCase());
        peugeot.setMaxSpeed(140);
        System.out.println(peugeot.getMaxSpeed());
        System.out.println("----------------------------------------");
        System.out.println("Lavo los tres vehiculos.".toUpperCase());
        peugeot.clean();
        truck.clean();
        bicycle.clean();
        System.out.println("----------------------------------------");
        System.out.println("Fin del programa.".toUpperCase());
    }
}
