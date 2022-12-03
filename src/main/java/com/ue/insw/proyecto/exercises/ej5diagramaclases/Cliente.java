package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Empleado{
 public Cliente(String nombre,String apellido, String puesto,String empresa,int edad, int telefono){
     super(nombre,apellido,puesto,empresa,edad,telefono);
 }

    public static void Empleado() {
     System.out.println("Antonio"+" Martínez"+" Cliente "+" Yoigo "+" 25 "+" 657435564");
 }
}
