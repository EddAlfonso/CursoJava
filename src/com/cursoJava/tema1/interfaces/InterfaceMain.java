package com.cursoJava.tema1.interfaces;

import com.cursoJava.tema1.poo.Car;

public class InterfaceMain {

    public static void main(String[] args) {

        CarService service1 = new CarServiceSportImpl();
        CarService service2 = new CarServiceClassicImpl();

        Car car1 = service1.createCar();
        Car car2 = service2.createCar();

        service2.deleteCar(car2);

    }
}
