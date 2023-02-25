package com.cursoJava.tema1.control;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10){
            i++; //condicion
            if(i == 6)
                break; //romple el flujo de ejecucion
                //continue; salta el valor 6 y continua con la sig iteracion
            System.out.println("Hola" + i);
        }

        System.out.println("FIN");
    }
}
