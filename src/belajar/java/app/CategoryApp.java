package belajar.java.app;

import belajar.java.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("1");
        System.out.println(category.getId());
    }
}
