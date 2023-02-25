package com.cursoJava.tema1.arrays;

public class EjemplosArrays {

    public static void main(String[] args) {

        int [] calif = new int[4];
        int [] calif2 = {6,7,8,9,10};

        calif[0] = 6;
        calif[1] = 7;
        calif[2] = 8;
        calif[3] = 10;
        calif[4] = 9;

        System.out.println(calif[2]);

        for (int i = 0; i < calif.length; i++){
            System.out.println(calif[i]);
        }

        for (int item : calif2) {
            System.out.println(item);
        }

        //calif2.binarySearch(calif2,9);
        //calif.sort(calif);

    }
}
