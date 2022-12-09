package com.ue.insw.proyecto.exercises.ej4;

    public class HornoLenaBakeStyle extends BakeStyle {

        public void bake(Pizza pizza) {
            System.out.println("La pizza se cocinara en horno de leña: " + pizza.toString());
        }

        public String toString () {
            return "HornoLenaBakeStyle";
        }

    }

