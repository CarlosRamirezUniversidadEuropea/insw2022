package com.ue.insw.proyecto.exercises.ej5diagramaclases;

import com.ue.insw.proyecto.exercises.documentation.Persona;

public class cliente extends Persona {

    private String nombre_empresa;
    private int telefono_de_contacto;

    public void mostrar(){

        String nombre_Empresa = "";
        int telefono_de_contacto = 0;

        System.out.println("El nombre de la empresa es " + nombre_Empresa);
        System.out.println("El telefono de contacto de la empresa es " + telefono_de_contacto);
    }
}
