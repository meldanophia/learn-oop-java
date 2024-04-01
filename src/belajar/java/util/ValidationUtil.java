package belajar.java.util;

import belajar.java.data.LoginRequest;
import belajar.java.error.BlankException;

public class ValidationUtil {
    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()){
            throw new BlankException("username is blank");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("password is blank");
        }
    }
}
