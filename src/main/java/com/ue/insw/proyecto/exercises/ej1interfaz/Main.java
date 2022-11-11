package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {

        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150 ,new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        try{
            peugeot.getSpeed();
            System.out.println("La velocidad actual es "+peugeot.getSpeed());
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            peugeot.startDriving(peugeot.getSpeed(), 100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            peugeot.getMaxSpeed();
            System.out.println("La velocidad maxima es " + peugeot.getMaxSpeed());
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(peugeot.getStatus());
        System.out.println(peugeot.toString());
        peugeot.clean();

        System.out.println("\n");

        Bicycle BMX = new Bicycle(BrandBicycle.BMX, ColorBicycle.RED,20 ,new BigDecimal(120));
        System.out.println(BMX.getPrice());
        System.out.println(BMX.getBrand());
        System.out.println(BMX.getColor());
        try{
            BMX.getSpeed();
            System.out.println("La velocidad actual es "+BMX.getSpeed());
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            BMX.startRiding(BMX.getSpeed(), 100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            BMX.getMaxSpeedBicycle();
            System.out.println("La velocidad maxima es " + BMX.getMaxSpeedBicycle());
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(BMX.toString());
        BMX.clean();

        Truck camion = new Truck(BrandCamion.SCANIA, Color.WHITE, 120 ,new BigDecimal(60000));
        System.out.println(camion.getPrice());
        System.out.println(camion.getBrand());
        System.out.println(camion.getColor());
        try{
            camion.getSpeed();
            System.out.println("La velocidad actual es "+peugeot.getSpeed());
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            peugeot.startDriving(peugeot.getSpeed(), 100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try{
            peugeot.getMaxSpeed();
            System.out.println("La velocidad maxima es " + peugeot.getMaxSpeed());
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(peugeot.getStatus());
        System.out.println(peugeot.toString());
        peugeot.clean();


    }
}
