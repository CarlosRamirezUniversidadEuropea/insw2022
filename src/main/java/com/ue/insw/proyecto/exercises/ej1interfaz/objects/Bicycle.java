package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Gasoline;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable {

    private Color color;




    public Bicycle( Color color, BigDecimal price) {
        super(price);

        this.color = color;


    }

    public Bicycle(BigDecimal price) {
        super(price);
    }

    //todo javadoc


    //todo javadoc





    @Override
    public void clean() {
        System.out.println("Bicicleta limpiándose");
    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento




    @Override
    public String toString() {
        return "Bycicle{" +
                "Color=" + color +

                '}';
    }
}
