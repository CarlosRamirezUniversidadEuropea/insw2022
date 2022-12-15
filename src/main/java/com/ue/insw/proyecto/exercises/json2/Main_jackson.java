package com.ue.insw.proyecto.exercises.json2;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ue.insw.proyecto.exercises.json.Persona;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main_jackson {
    public static void main(String[] args) throws IOException {

        String ruta = "src/main/java/com/ue/insw/proyecto/exercises/json2/names.json";
        // Create a File object for the JSON file
        File file = new File(ruta);
        ObjectMapper mapper = new ObjectMapper();


        // Check if the file exists and if we have permission to read it
        if (file.exists() && file.canRead()) {
            try {
                // Read the JSON file into a string
                Reader reader = Files.newBufferedReader(Paths.get(ruta));

                // Convert the JSON string to a Java object
                Persona[] obj = mapper.readValue(reader, Persona[].class);

                // Print the data from the Java object
                for (int i=0; i < obj.length;i++){
                    System.out.println("Nombre : " + obj[i].getFirst_name());
                    System.out.println("Apellido : " + obj[i].getLast_name());
                    System.out.println("Location : " + obj[i].getLocation());
                    System.out.println("Seguidores : " + obj[i].getFollowers()+"\n");

                }
            } catch (IOException e) {
                // Handle the IOException
            }
        } else {
            System.out.println("Error: Este programa no ha hecho nada");
            // Handle the case where the file does not exist or cannot be read
        }
    }
}