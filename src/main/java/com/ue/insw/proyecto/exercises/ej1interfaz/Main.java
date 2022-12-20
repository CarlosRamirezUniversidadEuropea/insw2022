package com.ue.insw.proyecto.exercises.ej1interfaz;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Bicycle;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Car;
import com.ue.insw.proyecto.exercises.ej1interfaz.objects.Truck;
import javafx.util.converter.ByteStringConverter;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000), 4587, Gasoline.OCTANE_95);
        System.out.println(peugeot.getPrice());
        System.out.println(peugeot.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());
        peugeot.clean();
        peugeot.fillCombustible(Gasoline.OCTANE_95,45);
        System.out.println(peugeot.getMaxSpeed());

        Truck volvo=new Truck(TruckBrand.volvo,Color.BLUE,10,new BigDecimal(150000));
        System.out.println(volvo.getPrice());
        System.out.println(t.getBrand());
        System.out.println(peugeot.getColor());
        System.out.println(peugeot.toString());





    }


}



