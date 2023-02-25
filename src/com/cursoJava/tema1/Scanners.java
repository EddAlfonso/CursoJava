package com.cursoJava.tema1;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        //Enviar y recibir datos desde la clase system

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        System.out.println("El nombre es: " + nombre + " y la edad es: " + edad);



    }
}
