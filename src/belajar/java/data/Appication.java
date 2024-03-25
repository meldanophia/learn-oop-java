package belajar.java.data;

public class Appication {

    public static final int PROCESSORS;

    static {
        System.out.println("mengakses class app");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
