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
        System.out.println(volvo.getBrand());
        System.out.println(volvo.getColor());
        System.out.println(volvo.toString());
        volvo.agregarkilos(100);
        volvo.clean();

        Bicycle bmx =new Bicycle(BrandBike.BMX, Color.BLACK, 12, new BigDecimal(800));
        System.out.println(bmx.getPrice());
        System.out.println(bmx.getBrandBike());
        System.out.println(bmx.getColor());
        System.out.println(bmx.toString());
        System.out.println(bmx.toString());
        bmx.clean();



    }


}



