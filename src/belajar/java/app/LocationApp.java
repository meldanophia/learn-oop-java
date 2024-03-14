package belajar.java.app;

import belajar.java.data.City;
import belajar.java.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        Location location = new Location(); //ERR

        City city = new City();
        city.name = "MELDA";

        System.out.println(city.name);
    }
}
