package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends  Persona {
    private String nombre_empresa;
    private String telefono_de_contacto;

    public Cliente(int Edad, String Nombre_empresa, String Telefono_de_contacto) {
        super(Edad);
        this.nombre_empresa = Nombre_empresa;
        this.telefono_de_contacto = Telefono_de_contacto;
    }

    public void mostrar() {
        System.out.println("Nombre empresa: " + nombre_empresa);
        System.out.println("Telefono de contacto: " + telefono_de_contacto);
    }
}
