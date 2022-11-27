package com.ue.insw.proyecto.exercises.ej2herencia;
import java.util.jar.Attributes;


public class Cat extends Animal implements Speak{
    // todo extends Animal implements speak, override methods
    private String raza;
    private String nombre;
    private int edad;

    public Cat(String raza, String nombre, int edad){
        super(raza,nombre );
        this.edad=edad;

    }
    public String getRaza(){
        return raza;
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
        System.out.println("miau-miau");

    }

    @Override

    public String toString(){
        return "Gato{"+
                "Rza: "+raza +
                ",Nombre: "+nombre+
                ",Edad: "+edad+
                "}";

    }

}
