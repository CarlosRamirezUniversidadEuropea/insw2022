package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona {
    private String nombre_empresa;
    private int telefono_de_contacto;
    public Cliente(String nombre, int edad, String nombre_empresa, int telefono_de_contacto){
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(int telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre_empresa='" + nombre_empresa + '\'' +
                ", telefono_de_contacto=" + telefono_de_contacto +
                '}';
    }
}
