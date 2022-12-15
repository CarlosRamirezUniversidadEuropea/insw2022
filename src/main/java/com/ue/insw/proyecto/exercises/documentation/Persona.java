package com.ue.insw.proyecto.exercises.documentation;

/**
 * Esta clase contiene los atributos y metodos de una Persona
 * @author Carlos Ram�rez
 * @version 1.0
 * @see Persona
 */
public class Persona {

    private int edad;
    private String nombre;
    private char sexo;
    
    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param sexo Sexo del empleado en formato H o M
     */
	public Persona(String nombre, int edad, char sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	 /**
     * Metodo constructor por defecto
     */
	public Persona(String personaNombre, int personaEdad) {}

    /**
     * Metodo para regresar la edad de la persona
     * @return Regresa la edad de la persona
     */
	public int getEdad() {
		return edad;
	}

	/**
     * Metodo que le asigna la edad a una persona
     * @param edad, la edad deseada a asignar
     */
	public void setEdad(int edad) {
		this.edad = edad;
	}

    /**
     * Metodo para regresar el nombre de la persona
     * @return Regresa el nombre de la persona
     */
	public String getNombre() {
		return nombre;
	}

	/**
     * Metodo que le asigna el nombre a una persona
     * @param nombre, el nombre deseada a asignar
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Metodo para regresar el sexo de la persona
     * @return Regresa el sexo de la persona
     */
	public char getSexo() {
		return sexo;
	}

	/**
     * Metodo que le asigna el sexo a una persona
     * @param sexo, el sexo deseado a asignar
     */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
    
	
    
}
