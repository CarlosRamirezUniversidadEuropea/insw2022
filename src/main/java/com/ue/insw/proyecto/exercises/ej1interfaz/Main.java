package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //Coche
        System.out.println("********************COCHE********************");
        Car peugeot = new Car(BrandVehicle.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), 20, GasolineVehicle.OCTANE_95);
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
            peugeot.setMaxSpeed(-1);
            peugeot.setSpeed(-10);
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
        System.out.println("********************BICICLETA********************");
        Bicycle bmc = new Bicycle(BrandBicycle.BMC, Color.RED, 70, new BigDecimal(3000));
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
            bmc.setMaxSpeed(-1);
            bmc.setSpeed(-10);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Tractor
        System.out.println("********************TRACTOR********************");
        Truck ford = new Truck(BrandTruck.FORD, Color.YELLOW, 35, new BigDecimal(45000), 50);
        System.out.println(ford.getPrice());
        System.out.println(ford.getBrand());
        System.out.println(ford.getColor());
        System.out.println(ford.toString());
        try {
            ford.startDriving(20,1000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        ford.clean();
        try{
            ford.setMaxSpeed(-1);
            ford.setSpeed(-10);
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
