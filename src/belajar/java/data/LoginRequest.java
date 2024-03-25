package belajar.java.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Note that we could write default constructor like these( without '()' )");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public void sayHello(){
        
    }
}
