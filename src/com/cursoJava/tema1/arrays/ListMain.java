package com.cursoJava.tema1.arrays;

import com.cursoJava.tema1.poo.Car;
import com.cursoJava.tema1.poo.ElectricCar;
import com.cursoJava.tema1.poo.HybridCar;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Edgar");
        nombres.add("Vero");
        nombres.add("Jessica");
        nombres.add("Miguel");

        System.out.println(nombres);

        for (String name : nombres) {
            System.out.println(name);
        }


        List<Car> cars = new ArrayList<Car>();
        cars.add(new ElectricCar());
        cars.add(new HybridCar());

        for (Car i: cars) {
            System.out.println(i);
        }

    }
}
