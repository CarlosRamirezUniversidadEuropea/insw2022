package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends  Persona{
    String nombre_empresa;
    int telefono_contacto;

    public Cliente(String nombre, int edad, String nombre_empresa, int telefono_contacto) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_contacto = telefono_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(int telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre_empresa='" + nombre_empresa + '\'' +
                ", telefono_contacto=" + telefono_contacto +
                '}';
    }
}
