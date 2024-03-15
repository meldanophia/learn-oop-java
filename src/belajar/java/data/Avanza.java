package belajar.java.data;

public class Avanza implements Car{

    public void drive() {
        System.out.println("Driver");
    }
    public int getTire() {
        return 0;
    }

    public String getBrand() {
        return "Touch";
    }

    public boolean isMaintenance() {
        return false;
    }
}
