package com.cursoJava.tema1.control;

public class Switch {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("Esta soleado");
                break;
            case "cloudy":
                System.out.println("Esta nublado");
                break;
            default:
                System.out.println("No se identifico el clima");
                break;

        }

    }
}
