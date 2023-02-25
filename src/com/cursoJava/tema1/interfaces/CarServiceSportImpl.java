package com.cursoJava.tema1.interfaces;

import com.cursoJava.tema1.poo.Car;

public class CarServiceSportImpl implements CarService {

    @Override
    public Car createCar() {
        System.out.println("Crear coche sport");
        return null;
    }

    @Override
    public void deleteCar(Car car) {
        System.out.println("No se hizo nada");
    }
}
