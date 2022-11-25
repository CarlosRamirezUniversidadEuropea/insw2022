package com.ue.insw.proyecto.exercises.ej2herencia;

 public class Human extends Animal implements Speak {

        private String raza;
        private String nombre;
        private String idioma;
        private String genero;
        private int edad;

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getIdioma() {
            return idioma;
        }

        public void setIdioma(String idioma) {
            this.idioma = idioma;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        @Override
        public int getEdad() {
            return edad;
        }

        @Override
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Human(String raza, String nombre, String idioma, String genero, int edad) {
            this.raza = raza;
            this.nombre = nombre;
            this.idioma = idioma;
            this.genero = genero;
            this.edad = edad;
        }

     @Override
     public void speak() {

     }
 }

