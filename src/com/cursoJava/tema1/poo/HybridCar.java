package com.cursoJava.tema1.poo;

public class HybridCar extends Car{

    String motorHibrido;

    public HybridCar(){
    }

    public HybridCar(String motorHibrido){
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorHibrido='" + motorHibrido + '\'' +
                '}';
    }
}
