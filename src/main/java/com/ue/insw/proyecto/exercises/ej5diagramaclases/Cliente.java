package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona{
    String nombre_empresa, telefono_de_contacto;

    public Cliente(String nombre, int edad, String nombre_empresa, String telefono_de_contacto){
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public void mostrar(){

        System.out.println("Nombre de Empresa: " +nombre_empresa);
        System.out.println("Telefono de Contacto: " +telefono_de_contacto);
    }
}
