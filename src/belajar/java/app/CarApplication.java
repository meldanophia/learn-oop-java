package belajar.java.app;

import belajar.java.data.Avanza;
import belajar.java.data.Car;


public class CarApplication {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
