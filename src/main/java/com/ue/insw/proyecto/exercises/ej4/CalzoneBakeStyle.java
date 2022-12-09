package com.ue.insw.proyecto.exercises.ej4;

public class CalzoneBakeStyle extends BakeStyle{

    public void bake(Pizza pizza) {
        System.out.println("La pizza se cocinara al estilo calzone: " + pizza.toString());
        int grados = 0;
        String tamanio="PEQUENIA";
        if(grados>50){
            System.out.println("El horno esta suficientemente cliente. COCINANDO pizza.");
        }else{
            System.out.println("El horno no esta suficientemente caliente. ESPERAR a que se caliente para utilizarlo. ");
        }

        System.out.println("Que tamaño de pizza desea? ");
        System.out.println("PEQUENIA");
        System.out.println("MEDIANA");
        System.out.println("GRANDE");

        if(tamanio=="PEQUENIA"){
            System.out.println("Ha elegido el siguiente tamanio --> PEQUENIA");
        }
        if(tamanio=="MEDIANA"){
            System.out.println("Ha elegido el siguiente tamanio --> MEDIANA");
        }
        if(tamanio=="GRANDE"){
            System.out.println("Ha elegido el siguiente tamanio --> GRANDE");
        }

    }


    public String toString () {
        return "CalzoneBakeStyle";
    }

}

