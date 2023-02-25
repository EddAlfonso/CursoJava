package com.cursoJava.tema1.poo;

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("azul", "honda", "civic", 120.00, 100.00);

        car2.acelerar(10);
        car2.color = "rojo";

        System.out.println(car2);

        ElectricCar electricCar = new ElectricCar();
        electricCar.acelerar(50);
        electricCar.motorElectrico = "Litio";
        electricCar.color = "rojo";
        electricCar.fabricante = "Toyota";
        electricCar.modelo = "Prius";
        electricCar.peso = 50.00;
        electricCar.largo = 200.00;

        System.out.println(electricCar);

        HybridCar car3 = new HybridCar();
        car3.acelerar(20);
        System.out.println(car3);

        ElectricCar car4 = new ElectricCar("verde", "Acura", "XYZ",
                150.00, 75.00, "WACS");

        System.out.println(car4);
        car4.acelerar(20);
        System.out.println(car4);



    }
}
