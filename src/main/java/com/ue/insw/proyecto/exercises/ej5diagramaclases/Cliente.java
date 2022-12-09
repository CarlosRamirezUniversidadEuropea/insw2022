package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona {
    private String nombre_de_empresa;
    private int telefono_de_contacto;

    public Cliente(String nombre,int edad, String nombre_de_empresa, int telefono_de_contacto){
        super(nombre ,edad);
        this.nombre_de_empresa=nombre_de_empresa;
        this.telefono_de_contacto=telefono_de_contacto;
    }

    public String getNombre_de_empresa() {
        return nombre_de_empresa;
    }

    public void setNombre_de_empresa(String nombre_de_empresa) {
        this.nombre_de_empresa = nombre_de_empresa;
    }

    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
}
