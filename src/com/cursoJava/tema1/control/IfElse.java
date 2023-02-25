package com.cursoJava.tema1.control;

public class IfElse {
    public static void main(String[] args) {

        boolean check = 5 < 10;

        if (check){
            System.out.println("verdadero1");
        }

        int num1 = 50;
        int num2 = 5;
        int num3 = 10;
        int num4 = 100;


        if (num1 < num2 && num2 < num3){
            System.out.println("verdadero2");
        }else if(num3<num4){
            System.out.println("else if");
        }else{

        }

        System.out.println("fin");
    }
}
