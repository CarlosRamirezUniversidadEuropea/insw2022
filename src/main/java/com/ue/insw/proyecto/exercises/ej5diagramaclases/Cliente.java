package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona {

    String nombre_empresa, telefono_de_contacto;

    public Cliente(String nombre, int edad, String nombre_empresa, String telefono_de_contacto) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Teléfono: "+telefono_de_contacto);
        System.out.println("Empresa: "+nombre_empresa);
    }
}
