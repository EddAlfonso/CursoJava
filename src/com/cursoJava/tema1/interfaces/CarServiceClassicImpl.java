package com.cursoJava.tema1.interfaces;

import com.cursoJava.tema1.poo.Car;
import com.cursoJava.tema1.poo.ElectricCar;

public class CarServiceClassicImpl implements CarService {

    @Override
    public Car createCar() {
        System.out.println("Crear coche clasico");
        return new ElectricCar();
    }

    @Override
    public void deleteCar(Car car) {
        System.out.println("Borrar coche clasico");
    }


}
