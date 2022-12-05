package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), Gasoline.OCTANE_95);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.fillCombustible(Gasoline.OCTANE_95,5);
        peugeot.clean();

        Bicycle bmx = new Bicycle(BycicleBrand.BMX, Color.BLACK, 60, new BigDecimal(700));
        System.out.println(bmx.getPrice());
        System.out.println(bmx.getBrand());
        System.out.println(bmx.getColor());
        System.out.println(bmx.toString());
        bmx.clean();

        Truck volvo = new Truck(TruckBrand.Volvo, Color.BLACK, 100, new BigDecimal(120000));
        System.out.println(volvo.getPrice());
        System.out.println(volvo.getBrand());
        System.out.println(volvo.getColor());
        System.out.println(volvo.toString());
        volvo.addKilos(50);
        volvo.clean();


    }
}
