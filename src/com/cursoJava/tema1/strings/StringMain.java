package com.cursoJava.tema1.strings;

public class StringMain {
    public static void main(String[] args) {
        //La clase String
        //Metodos de la clase
            /*length()
            startsWith()
            endsWith()
            contains()
            equals()
            toLowerCase()
            toUpperCase()
            toTitleCase().. entre otros*/


        String mensaje = " Hola mundo ";
        System.out.println(mensaje.length());
        String mensajeMayus = mensaje.toUpperCase();
        System.out.println(mensajeMayus);
        System.out.println(mensajeMayus.trim());
        String mensaje2 = " HOLA MUNDO ";

        if (mensajeMayus.equals(mensaje2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras NO son iguales");
        }

    }
}

