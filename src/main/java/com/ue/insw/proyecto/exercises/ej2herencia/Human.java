package com.ue.insw.proyecto.exercises.ej2herencia;

// todo extends animal, implements speak ?
public class Human extends Animal implements Speak {
    private int edad;
    private String nombre;
    private String raza;



    public Human (String nombre,int edad,String raza){
        super(nombre,raza);
        this.edad=edad;

    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }



    @Override
    public void speak() {
        System.out.println("Hola");
    }

    @Override
    public String toString() {
            return "Humano{" +
                    "Raza:"+ raza+
                    ",Nombre: " + nombre +
                    ",Edad: " + edad +
                    "}";
        }


}
