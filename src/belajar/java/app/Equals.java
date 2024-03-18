package belajar.java.app;

public class Equals {
    public static void main(String[] args) {
        String first = "Melda";
        String name = first + " " + "Nophia";

        String name2 = "Melda Nophia";

        System.out.println(name == name2);

        System.out.println(name.equals(name2));
    }
}
