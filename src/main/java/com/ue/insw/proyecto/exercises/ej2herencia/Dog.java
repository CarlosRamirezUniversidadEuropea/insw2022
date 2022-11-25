package com.ue.insw.proyecto.exercises.ej2herencia;

    public class Dog extends Animal implements Speak {

        private String raza;
        private String nombre;
        private String idioma;
        private String genero;
        private String habitat;
        private int edad;
        private String mascota;

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

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        @Override
        public int getEdad() {
            return edad;
        }

        @Override
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Dog(String raza, String nombre, String idioma, String genero, String habitat, int edad, String mascota) {
            this.raza = raza;
            this.nombre = nombre;
            this.idioma = idioma;
            this.genero = genero;
            this.habitat = habitat;
            this.edad = edad;
            this.mascota = mascota;
        }

     @Override
     public void speak() {

     }


 }


