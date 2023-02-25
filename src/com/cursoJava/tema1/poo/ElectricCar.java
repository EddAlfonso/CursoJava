package com.cursoJava.tema1.poo;

public class ElectricCar extends Car {

    String motorElectrico;

    public ElectricCar(){

    }

    public ElectricCar(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public ElectricCar(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAdjust = cantidad * 2;
        super.acelerar(cantidadAdjust);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
