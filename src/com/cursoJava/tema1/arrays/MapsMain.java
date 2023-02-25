package com.cursoJava.tema1.arrays;

import java.util.HashMap;
import java.util.Map;

public class MapsMain {

    public static void main(String[] args) {

        //Se crea un map. los maps estan estructurados por claves, valores
        Map<Integer, String> personas = new HashMap<>();

        // Se agregamn valores
        personas.put(12345, "Juan Perez");
        personas.put(54332, "Roberto Perez");
        personas.put(98765, "Diana Perez");

        System.out.println(personas);

        //Se imprimen las claves
        for(Integer key : personas.keySet()){
            System.out.println(key);
        }
        //Se imprimen los nombres
        for(String name : personas.values()){
            System.out.println(name);
        }

        //Sacar los resultados en pares
        for (Map.Entry<Integer, String> pares : personas.entrySet()){
            System.out.println(pares.getKey() + " : " + pares.getValue());
        }

    }
}
