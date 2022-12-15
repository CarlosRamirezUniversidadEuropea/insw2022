package com.ue.insw.proyecto.exercises.documentation;

/**
 * Esta clase contiene los atributos y metodos de un empleado
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Persona
 */
public class Empleado extends Persona{
    
    private int numeroEmpleado;
    private String departamento;
    private String puesto;
    
    /**
     * Metodo constructor por defecto
     */
    public Empleado(int personaEdad, String personaNombre){
        super(personaNombre, personaEdad);
    }
    
    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param sexo Sexo del empleado en formato H o M
     * @param numeroEmpleado Numero de empleado
     * @param departamento Departamento donde trabajara el empleado
     * @param puesto Puesto que ocupara el empleado dentro de la empresa
     */
    public Empleado(String nombre, 
                    int edad, 
                    char sexo, 
                    int numeroEmpleado, 
                    String departamento, 
                    String puesto){
        super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    
    /**
     * Metodo para regresar el numero de empelado
     * @return Regresa el numero del empleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    /**
     * Establece el numero del empleado
     * @param numeroEmpleado Numero que se le asignara al empleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    /**
     * Metodo que regresa el nombre del departamento asignado al empleado
     * @return Regresa el departamento
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * Metodo que le asigna departamento a un empelado
     * @param departamento Nombre de departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    /**
     * Metodo que regresa el puesto del empleado
     * @return Regresa un String que indica el puesto
     */
    public String getPuesto() {
        return puesto;
    }
    
    /**
     * Metodo que establece el puesto del empleado
     * @param puesto Indica el puesto del empleado
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}