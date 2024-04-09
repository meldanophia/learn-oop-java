package belajar.java.data;

import belajar.java.annotation.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    @NotBlank
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
