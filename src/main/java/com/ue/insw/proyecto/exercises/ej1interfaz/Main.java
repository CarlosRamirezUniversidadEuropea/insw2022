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
        peugeot.clean();
        System.out.println("Intento conducir el coche para probar el método con try catch");
        try {
            peugeot.startDriving(20, 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ahora compruebo que no se puede poner velocidad negativa");
        try{
            peugeot.setMaxSpeed(50);
            System.out.println("La velocidad del coche es " + peugeot.getMaxSpeed());
            peugeot.setMaxSpeed(-100);
            System.out.println("La nueva velocidad del coche es " + peugeot.getMaxSpeed());
        }catch(Exception e){
            e.printStackTrace();
        }



        Truck camion = new Truck(new BigDecimal(10000), Color.LIGHT_GREY, 7000);
        System.out.println("Camion: " + camion);
        camion.clean();
        System.out.println("Intento cargar una carga más alta de la soportada en el camión");
        try{
            camion.setCargaCamion(100);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Bicycle bici = new Bicycle(new BigDecimal(1500), Color.WHITE, Brand.TOYOTA);
        System.out.println("Bicicleta: " + bici);
        bici.clean();
        bici.startRiding();

    }


    }

