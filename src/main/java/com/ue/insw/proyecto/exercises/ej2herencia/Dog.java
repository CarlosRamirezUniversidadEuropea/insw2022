package com.ue.insw.proyecto.exercises.ej2herencia;

import javax.print.DocFlavor;
import java.lang.ref.SoftReference;

public class Dog extends Animal implements Speak {
    // todo complete extends Animal implements speak, override methods
    private int edad;
    private String raza;
    private String nombre;


    public Dog(String raza, String nombre, int edad){
        super(raza,nombre );
        this.edad=edad;

    }

    public String getRaza(){
        return raza ;
    }
    public void setRaza(String raza){
        this.raza=raza;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }

    @Override
    public void speak() {
        System.out.println("uau-uau");

    }
    @Override
    public String toString(){
        return "Perro{"+
                "Raza: "+raza +
                ",Nombre: "+nombre+
                ",Edad: "+edad+
                "}";

    }


}
