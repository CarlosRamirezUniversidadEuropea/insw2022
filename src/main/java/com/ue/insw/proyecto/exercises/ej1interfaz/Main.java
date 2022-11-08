package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.BrandBicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        Bicycle Cristian = new Bicycle(BrandBicycle.SCOTT, Color.WHITE, new BigDecimal(800));
        System.out.println(Cristian.getBrand());
        System.out.println(Cristian.getColor());
        System.out.println(Cristian.getPrice());
        Cristian.clean();

        Bicycle Max = new Bicycle(BrandBicycle.BIANCHI, Color.LIGHT_GREY, new BigDecimal(670));
        System.out.println(Max.getBrand());
        System.out.println(Max.getColor());
        System.out.println(Max.getPrice());
        Max.clean();

    }
}
