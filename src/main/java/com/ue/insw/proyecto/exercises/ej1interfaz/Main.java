package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //Coche
        System.out.println("COCHE CREADO");
        Car peugeot = new Car(BrandVehicle.AUDI, Color.BLACK, 170, new BigDecimal(35000), 35, GasolineVehicle.GASOLEO_A);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.getMaxSpeed());
        System.out.println(peugeot.getGas());
        System.out.println(peugeot.toString());
        try {
            peugeot.startDriving(20,1000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        peugeot.clean();
        try{
            peugeot.setMaxSpeed(-100);
            peugeot.setSpeed(-20);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            peugeot.fillCombustible(GasolineVehicle.GASOLEO_A, 20);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            peugeot.fillCombustible(GasolineVehicle.OCTANE_95, 20);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Bicicleta
        System.out.println("\nBICICLETA CREADA");
        Bicycle bmc = new Bicycle(BrandBicycle.BMC, Color.BLACK, 60, new BigDecimal(1000));
        System.out.println(bmc.getPrice());
        System.out.println(bmc.getBrand());
        System.out.println(bmc.getColor());
        System.out.println(bmc.toString());
        try {
            bmc.startDriving(20,1000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        bmc.clean();
        try{
            bmc.setMaxSpeed(-60);
            bmc.setSpeed(-30);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Camión
        System.out.println("\nCAMIÓN CREADO");
        Truck ford = new Truck(BrandTruck.FORD, Color.LIGHT_GREY, 90, new BigDecimal(60000), 45);
        System.out.println(ford.getPrice());
        System.out.println(ford.getBrand());
        System.out.println(ford.getColor());
        try {
            ford.startDriving(20,1000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        ford.clean();
        try{
            ford.setMaxSpeed(-70);
            ford.setSpeed(-40);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            ford.fillCombustible(GasolineVehicle.GASOLEO_A, 20);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            ford.fillCombustible(GasolineVehicle.DIESEL, 20);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
