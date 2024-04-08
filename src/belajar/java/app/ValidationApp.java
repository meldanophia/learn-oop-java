package belajar.java.app;

import belajar.java.annotation.Fancy;
import belajar.java.data.LoginRequest;
import belajar.java.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "ValidApp", tags = {"application", "java"})
    public static void main(String[] args) {
//        LoginRequest loginRequest = new LoginRequest("melda","Rahasia123");


        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
