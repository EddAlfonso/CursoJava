package com.cursoIntro;

import com.cursoJava.tema1.control.Switch;

public class Condicionales {
    public static void main(String[] args) {
        // IF
        System.out.println("IF");
        int numeroIf = 2;
        if (numeroIf == 0) {
            System.out.println("El numero es un cero");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }


        //While
        System.out.println("While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Do While
        System.out.println("Do While");
        int numeroDo =0;
        do {
            System.out.println(numeroDo);
            numeroDo++;
        } while (numeroDo > 3);

        //FOR
        System.out.println("For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Switch
        System.out.println("Switch");
        String estacion = "Verano";

        switch (estacion) {
            case "Primavera":{
                System.out.println("Es primavera");
                break;
            }
            case "Verano":{
                System.out.println("Es verano");
                break;
            }
            case "Otono":{
                System.out.println("Es otono");
                break;
            }
            case "Inviero":{
                System.out.println("Es inviero");
                break;
            }
            default:{
                System.out.println("Esa estacion no existe");
            }
        }

    }
}
