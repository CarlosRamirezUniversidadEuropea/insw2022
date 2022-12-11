package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Empleado extends Persona {
    private static int sueldo_bruto;
    private static String nombre;
    private static int edad;

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Empleado() {
        super();
    }
    public Empleado(String nombre, int edad, int sueldo_bruto){
        this.sueldo_bruto=sueldo_bruto;
        this.nombre=nombre;
        this.edad=edad;
    }

    public static void mostrar_empleado(){
        System.out.println( "Nombre: "+nombre+", edad: "+edad+", sueldo bruto: "+sueldo_bruto);
    }

    public double calcular_salario_neto(){
       return sueldo_bruto-200;
    }

}