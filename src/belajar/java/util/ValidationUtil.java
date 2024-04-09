package belajar.java.util;

import belajar.java.annotation.NotBlank;
import belajar.java.data.LoginRequest;
import belajar.java.error.BlankException;

import java.lang.reflect.Field;

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

    public static void validateReflection(Object object)  {
        Class aClass =  object.getClass();
        // get All fields whether public or private fields
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                //validated
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank " );
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field" + field.getName());
                }
            }

        }
    }
}
