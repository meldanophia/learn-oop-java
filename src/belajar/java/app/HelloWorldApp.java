package belajar.java.app;

import belajar.java.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("hello");
            }


            public void sayHello(String name) {
                System.out.println("hello" + name);
            }
        };
        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("halo");
            }


            public void sayHello(String name) {
                System.out.println("halo" + name);
            }
        };
    }
}
