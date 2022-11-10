package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Bicycle extends Vehicle implements Cleanable{

        private BycicleBrand brand;
        private Color color;
        private int maxSpeed;
        private int speed;
        private Status status;

        public Bicycle(BycicleBrand brand, Color color, int maxSpeed, BigDecimal price) {
            super(price);
            this.brand = brand;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.speed = 0;
            this.status = STOPED;
        }

        public Bicycle(BigDecimal price) {
            super(price);
        }

        //todo javadoc
        public void on() {
            this.status = ON;
        }

        //todo javadoc
        public void stop() {
            this.speed = 0;
            this.status = STOPED;
        }

        //todo javadoc
        public void setSpeed(int speed) {
            this.speed = speed;
        }




        /**
         * Starts driving the Bicycle
         * @param speed desired to drive
         * @param time in seconds
         */
        public void startDriving (int speed, int time) {
            // todo Create method to start driving
        }

        @Override
        public void clean() {
            System.out.println("Bicicleta limpiándose");
        }

        public BycicleBrand getBrand() {
            return brand;
        }

        public void setBrand(BycicleBrand brand) {
            this.brand = brand;
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

        //todo la velocidad tiene que ser un numero positivo, modificar método, encapsulamiento
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }


        public int getSpeed() {
            return speed;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Bycicle{" +
                    "brand=" + brand +
                    ", color=" + color +
                    ", maxSpeed=" + maxSpeed +
                    ", speed=" + speed +
                    ", status=" + status +
                    '}';
        }
    }
