package com.ue.insw.proyecto.exercises.ej1interfaz.objects;

import com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.*;
import com.ue.insw.proyecto.exercises.ej1interfaz.interfaces.Cleanable;

import java.math.BigDecimal;

import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.ON;
import static com.ue.insw.proyecto.exercises.ej1interfaz.enumerates.Status.STOPED;

//todo extender de Vehicle
//todo implements Cleanable
public class Truck extends Vehicle implements Cleanable{

        private TruckBrand brand;
        private Color color;
        private int maxSpeed;
        private int speed;
        private Status status;
        private int actualLiters;
        private Gasoline gasoline;
        private int cargaKilos;

        public Truck(TruckBrand brand, Color color, int maxSpeed, BigDecimal price) {
            super(price);
            this.brand = brand;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.speed = 0;
            this.cargaKilos=0;
            this.status = STOPED;
        }

        public Truck(BigDecimal price) {
            super(price);
        }

        //todo javadoc
    /**
     * Gets the car status
     * @param "status" desired to know if it is stoped or not
     */
        public void on() {
            this.status = ON;
        }

        //todo javadoc
    /**
     * weather the car is stoped or not
     * @param "STOPED" to check if the car status stoped or driving
     */
        public void stop() {
            this.speed = 0;
            this.status = STOPED;
        }

        //todo javadoc
    /**
     * Set up the car speed
     * @param speed desired to drive
     */
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        /**
         * fills the Truck with gasoline
         * @param gasoline type of gas
         * @param liters number of liters
         */
        public void fillCombustible(Gasoline gasoline, int liters) throws Exception {
            if (this.gasoline == gasoline) {
                actualLiters= actualLiters + liters;
                System.out.println(" Has rellenado " + liters + " Litros con exito :)");

            } else {
                throw new Exception("El combustible no coincide con lo del coche ");
            }

            //todo Create method to fill car
        }

        /**
         * Starts driving the Truck
         * @param speed desired to drive
         * @param time in seconds
         */
        public void startDriving (int speed, int time) throws Exception {

            if (actualLiters < 0){
                System.out.println("Comprobando si el coche tiene Combustible");
                System.out.println("El coche tiene: "+ actualLiters + " Litros ");

            }else {
                throw new Exception ("El coche no tiene Combustible Porfavor inserte Combustible para arrancar el coche");
            }

            // todo Create method to start driving
        }

        @Override
        public void clean() {
            System.out.println("Camion limpiándose");
        }
        public TruckBrand getBrand() {
            return brand;
        }

        public void setBrand(TruckBrand brand) {
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
        public void setMaxSpeed(int maxSpeed) throws Exception {
            this.maxSpeed = maxSpeed;
            if (maxSpeed <0 ){
            throw new Exception("El numero tiene que ser positivo");
        }else{
            this.maxSpeed = maxSpeed;
            System.out.println("La velocidad se ha modificado");
        }
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

        public void addKilos(int kilos)throws Exception {
            if(cargaKilos <= 32000){
                cargaKilos= cargaKilos+kilos;

                System.out.println("El peso de la carga es: " + cargaKilos );
            }else{
                throw new Exception("El vehiculo ha superado los kilos maximos soportables porfavor Disminuye la carga ");
            }
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "brand=" + brand +
                    ", color=" + color +
                    ", maxSpeed=" + maxSpeed +
                    ", speed=" + speed +
                    ", status=" + status +
                    '}';
        }
    }