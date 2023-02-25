package com.cursoJava.tema1.poo;

public class PolimorfismoMain {
    public static void main(String[] args) {

        // Crear objetos sin polimorfismo
        Car car1 = new Car();
        ElectricCar car2 = new ElectricCar();
        HybridCar car3 = new HybridCar();

        //Polimorfismo
        Car car4 = new ElectricCar();
        Car car5 = new HybridCar();

        if (car4 instanceof ElectricCar)
            System.out.println("El carro es un electrico");
        else if (car4 instanceof HybridCar)
            System.out.println("El carro es hibrido");
        else
            System.out.println("Tipo de carro desconocido");

    }
}
