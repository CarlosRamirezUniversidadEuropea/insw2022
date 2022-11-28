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

        System.out.println("CAMIÓN: ");

        Truck camion = new Truck(new BigDecimal(10000), Color.LIGHT_GREY, 6500);
        System.out.println("Camion: " + camion);
        System.out.println("El color del camión es: " + camion.getColor());
        System.out.println("La velocidad máxima del camión es: " + camion.getMaxSpeed());
        System.out.println("¡Atención! La carga máxima del camión es: " + camion.getMaxKilos());
        camion.clean();
        System.out.println("Carga soportada. Si introducimos valor negativo saltará excepción. ");
        try {
            camion.setCargaCamion(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("");

        System.out.println("BICICLETA: ");
        Bicycle bici = new Bicycle(new BigDecimal(700), Color.RED, Brand.TESLA);
        System.out.println("Bicicleta: " + bici);
        System.out.println("La marca de la bicicleta es: " + bici.getBrand());
        bici.setMaxSpeed(50);
        System.out.println("La velocidad máxima de la bicicleta es: " + bici.getMaxSpeed());
        bici.clean();
        bici.startRiding();

        System.out.println("");

        System.out.println("COCHE: ");
        Car peugeot = new Car(Brand.PEUGEOT, Color.BLACK, 150, new BigDecimal(12000));
        System.out.println(peugeot.toString());
        System.out.println("El precio del coche es: " + peugeot.getPrice());
        System.out.println("La marca del coche es: " + peugeot.getBrand());
        System.out.println("El color del coche es: " + peugeot.getColor());
        System.out.println("Echamos gasolina antes de arrancar." );
        peugeot.fillCombustible(Gasoline.OCTANE_98, 50);
        peugeot.clean();
        System.out.println("\tIntentamos conducir el coche. Si la velocidad introducida es mayor a la" +
                "velocidad máxima del coche, saltará una excepción. ");
        try {
            peugeot.startDriving(peugeot.getLitrosActuales(), 70, 10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("\tComprobamos método de velocidad máxima. Si introducimos valor negativo saltará excepción. ");
        try {
            peugeot.setMaxSpeed(120);
            System.out.println("El coche va a: " + peugeot.getMaxSpeed() + " km/h");
            //peugeot.setMaxSpeed(-10);
            //System.out.println("El coche va a: " + peugeot.getMaxSpeed() + " km/h");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}