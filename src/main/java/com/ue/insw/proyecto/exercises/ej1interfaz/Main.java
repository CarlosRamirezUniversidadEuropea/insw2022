package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;
import java.util.Vector;


public class Main {




    public static void main(String[] args) {
        Car car1 = new Car(Brand.FORD, Color.BLACK, 140,  Gasoline.GASOLEO_A, 50, 20, new BigDecimal(14000));
        Truck track1 =new Truck(Brand.PEUGEOT, Color.WHITE, 120, Gasoline.OCTANE_98, 60, 20, 26000, new BigDecimal(12000));
        Bicycle bicycle1 = new Bicycle(Color.RED, Brand_Bici.ENDURO, new BigDecimal(2000));

        System.out.println(car1.toString());
        System.out.println(car1.getPrice());
        car1.clean();
        car1.fillCombustible(Gasoline.GASOLEO_A, 10, Gasoline.GASOLEO_A, 20, 50);
        car1.startDriving(100, 12, 50, 140);
        car1.stop();

        System.out.println(track1.toString());
        System.out.println(track1.getPrice());
        track1.clean();

        System.out.println(bicycle1.toString());
        System.out.println(bicycle1.getPrice());
        bicycle1.clean();
        bicycle1.clean();
        bicycle1.startRiding(20, 50, 14, true);



    }
}
