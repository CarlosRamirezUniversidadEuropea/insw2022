package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente extends Persona{
    String nombre_de_empresa;
    int tf_contacto;

    public Cliente(String firstName, String lastName, int edad, String nombre_de_empresa, int tf_contacto) {
        super(firstName, lastName, edad);
        this.nombre_de_empresa=nombre_de_empresa;
        this.tf_contacto=tf_contacto;
    }

    public String getNombre_de_empresa() {
        return nombre_de_empresa;
    }

    public void setNombre_de_empresa(String nombre_de_empresa) {
        this.nombre_de_empresa = nombre_de_empresa;
    }

    public int getTf_contacto() {
        return tf_contacto;
    }

    public void setTf_contacto(int tf_contacto) {
        this.tf_contacto = tf_contacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre_de_empresa='" + nombre_de_empresa + '\'' +
                ", tf_contacto=" + tf_contacto +
                '}';
    }
}

