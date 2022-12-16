package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona{
        private String nombreEmpresa;
        private String telef;

        public Cliente(String nombre, int edad, String nombreEmpresa, String telef){
        super(nombre, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.telef = telef;
        }
@Override
        public String toString(){
            return "Nombre: "+ getNombre() +"\nEdad: "+getEdad()+"\nEmpresa: "+nombreEmpresa+"\nT.Contacto: "+telef;
        }
}
