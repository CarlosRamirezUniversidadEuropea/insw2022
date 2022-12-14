package com.ue.insw.proyecto.exercises.ej5diagramaclases;

public class Cliente  extends Persona{
    private String nombreEmpresa;
    private int telefonoContacto;

    public Cliente(String nombreEmpresa, int telefonoContacto) {
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoContacto = telefonoContacto;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelefono() {
        return telefonoContacto;
    }

    public void setTelefono(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre de la empresa='" + nombreEmpresa + '\'' +
                ", telefono de contacto=" + telefonoContacto +
                '}';
    }
}