package belajar.java.app;

import belajar.java.data.Appication;
import belajar.java.data.Constant;
import belajar.java.data.Country;
import belajar.java.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(Appication.PROCESSORS);
    }
}
