package belajar.java.app;

import belajar.java.data.CreateUserRequest;
import belajar.java.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest req = new CreateUserRequest();
        req.setName("Melda");
        req.setPassword("Rahasia");
        req.setUsername("goddess");

        ValidationUtil.validateReflection(req);
    }
}
