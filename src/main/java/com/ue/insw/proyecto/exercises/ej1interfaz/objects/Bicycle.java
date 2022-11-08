package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle{

    private BrandBicycle brand;
    private Color color;
    private int maxSpeed;
    private int speed;
    private Status status;
}
