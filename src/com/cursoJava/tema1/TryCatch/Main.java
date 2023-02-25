package com.cursoJava.tema1.TryCatch;

public class Main {

    public static void main(String[] args) {

        try {
            int result = 5/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("fin");
        }
    }
}
