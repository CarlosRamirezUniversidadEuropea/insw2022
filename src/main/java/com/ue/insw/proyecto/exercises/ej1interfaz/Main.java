package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BicyBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.TrukBrand;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        Bicycle bicycle= new Bicycle(new BigDecimal(1000), 60,BicyBrand.CANNONDALE, Color.WHITE);
        Truck truck=new Truck(new BigDecimal(50000),10000, TrukBrand.FORD, Color.LIGHT_GREY);
        System.out.println(peugeot.toString());
        System.out.println(bicycle.toString());
        peugeot.clean();
    }
}
