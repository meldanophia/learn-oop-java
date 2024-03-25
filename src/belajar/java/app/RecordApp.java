package belajar.java.app;

import belajar.java.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("melda", "rahasia");

        System.out.println(loginRequest);
        //getter username
        System.out.println(loginRequest.username());
        //getter password
        System.out.println(loginRequest.password());
    }
}
