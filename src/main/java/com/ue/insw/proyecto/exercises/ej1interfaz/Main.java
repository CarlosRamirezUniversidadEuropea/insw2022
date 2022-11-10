package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println("Precio: " + peugeot.getPrice() + "€");
        System.out.println("Brand: " + peugeot.getBrand());
        System.out.println("Color: " + peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();

        System.out.println("----------------------");
        Truck volvo = new Truck(Brand.VOLVO, Color.WHITE, 8900, new BigDecimal(72000)) ;

        System.out.println("Precio: " + volvo.getPrice() + "€");
        System.out.println("Brand: " + volvo.getBrand());
        System.out.println("Color: " + volvo.getColor());
        System.out.println(volvo.toString());
        peugeot.clean();



    }
}
