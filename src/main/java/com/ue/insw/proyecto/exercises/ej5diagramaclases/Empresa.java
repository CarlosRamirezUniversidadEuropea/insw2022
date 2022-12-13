package com.ue.insw.proyecto.exercises.ej5diagramaclases;
import java.util.List;

public class Empresa {
    private String nombre;
    List<Empleado> listaEmpleados;
    List<Cliente> listaClientes;

    public Empresa(String Nombre, List<Cliente> ListaClientes, List<Empleado> ListaEmpleados) {
        this.nombre = Nombre;
        this.listaClientes = ListaClientes;
        this.listaEmpleados = ListaEmpleados;
    }
}
