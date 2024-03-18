package belajar.java.data;

public class ProductApp {
    public static void main(String[] args) {
        Product app = new Product("Melda", 100);
        System.out.println(app);

        Product product2 = new Product("Melda", 100);
        System.out.println(app.equals(product2));
    }
}
