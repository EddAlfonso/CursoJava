package com.cursoJava.tema1;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();
        holaMundo("Edgar");
        sum(5,6);

    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde el metodo");
    }
    protected static void holaMundo(String name) {
        System.out.println("Hola" + name + " desde el metodo 2");
    }
    protected static void holaMundo(String name, String surname) { //Sobrecarga de metodos!!!!
        System.out.println("Hola" + name + surname +" desde el metodo 2");
    }

    private static int sum(int a, int b){ //Dependiendo del valor (int, float, etc) el return debe regresar eso
        return a + b;
    }

}
