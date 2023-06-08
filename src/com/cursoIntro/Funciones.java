package com.cursoIntro;

public class Funciones {
    public static void main(String[] args) {
        //Se imprime el llamado a la funcion suma dandole 3 parameters
        System.out.println(suma(10,20,30));

        //Se crea el objeto
        Coche miCoche = new Coche();
        miCoche.addPuertas();
        System.out.println(miCoche.numPuertas);

    }
    //Parte 1. Funcion que suma con tres parametros
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

//Parte 2. Se crea la clase Coche
class Coche {
    int numPuertas;

    public void addPuertas(){
        numPuertas++;
    }
}
