package com.ue.insw.proyecto.exercises.ej4;

public class Main {
    public static void main(String[] args) {
        HornoLeña hornoLeña = new HornoLeña();
        HornoGas hornoGas = new HornoGas();
        CarbonaraPizza carbonara = new CarbonaraPizza();
        hornoLeña.bake(carbonara);
        BarbecuePizza barbacoa = new BarbecuePizza();
        hornoGas.bake(barbacoa);
        HawaianPizza hawaiana = new HawaianPizza();
        hornoLeña.bake(hawaiana);
    }
}
