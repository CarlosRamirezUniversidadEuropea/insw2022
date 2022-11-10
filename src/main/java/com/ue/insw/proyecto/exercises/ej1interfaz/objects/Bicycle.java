package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Brand;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Color;
import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

public class Bicycle{
    public class Bycicle extends Vehicle implements Cleanable {

        private Color color;
        private int maxSpeed;
        private int speed;

        public Bycicle(Color color, int maxSpeed, BigDecimal price) {
            super(price);
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.speed = 0;
        }

        public Color getColor(String green) {
            return color;
        }

        public Bycicle(BigDecimal price) {
            super(price);
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }


        private void startDriving (int speed, int time) {
            startDriving(speed, time);
        }

        @Override
        public void clean() {
            System.out.println("La bicicleta se está limpiando");
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public int getSpeed() {
            return speed;
        }


        @Override
        public String toString() {
            return "Car{" +
                    ", color=" + color +
                    ", maxSpeed=" + maxSpeed +
                    ", speed=" + speed +
                    '}';
        }
    }
}
