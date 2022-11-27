package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        System.out.println("Intentamos conducir el coche");
        try{
            peugeot.startDriving(70, 10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Comprobamos que no se pueden dar velocidades negativas");
        try{
            peugeot.setMaxSpeed(120);
            System.out.println("El coche va a: " + peugeot.getMaxSpeed() + " km/h");
            peugeot.setMaxSpeed(-10);
            System.out.println("El coche va a: " + peugeot.getMaxSpeed() + " km/h");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Truck camion = new Truck(new BigDecimal(10000), Color.LIGHT_GREY, 7000);
        System.out.println("Camion: " + camion);
        camion.clean();
        System.out.println("Intento cargar una carga más alta de la soportada en el camión");
        try{
            camion.setCargaCamion(10000);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Bicycle bici = new Bicycle(new BigDecimal(1500), Color.WHITE, Brand.TOYOTA);
        System.out.println("Bicicleta: " + bici);
        bici.clean();
        bici.startRiding();

    }
}
