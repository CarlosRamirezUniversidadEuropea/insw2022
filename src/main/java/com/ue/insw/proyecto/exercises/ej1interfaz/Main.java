package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    //Coche
    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 280, new BigDecimal(12000),85,Gasoline.GASOLEO_A);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
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
            peugeot.fillCombustible(Gasoline.OCTANE_98, 20);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            peugeot.fillCombustible(Gasoline.OCTANE_95, 20);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Camión
        Truck mercedes=new Truck(Brand.MERCEDES, Color.RED,10,new BigDecimal(90000),100,Gasoline.OCTANE_95,1250);
        System.out.println(mercedes.toString());
        System.out.println(mercedes.getPrice());
        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.getColor());

         try {
             mercedes.startDriving(20,1000);
         } catch (Exception e){
             throw new RuntimeException(e);
        }
        mercedes.clean();
        try{
            mercedes.setMaxSpeed(-1);
            mercedes.setSpeed(-10);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            mercedes.fillCombustible(Gasoline.GASOLEO_A, 30);
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            mercedes.fillCombustible(Gasoline.OCTANE_98, 30);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Bici
        Bicycle bmx=new Bicycle(Brand.FORD,Color.BLUE,9,new BigDecimal(250));
        System.out.println(bmx.toString());
        System.out.println(bmx.getPrice());
        System.out.println(bmx.getBrand());
        System.out.println(bmx.getColor());

        try {
            bmx.startriding(20,1000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        bmx.clean();
        try{
            bmx.setMaxSpeed(-1);
            bmx.setSpeed(-10);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
