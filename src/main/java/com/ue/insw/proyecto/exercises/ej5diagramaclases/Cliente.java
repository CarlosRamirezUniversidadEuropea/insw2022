package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona{
    String nombre_empresa, telefono_de_contacto;

    void mostrar(){
        System.out.println("Nombre de Empresa: " +nombre_empresa);
        System.out.println("Telefono de Contacto: " +telefono_de_contacto);
    }
}
