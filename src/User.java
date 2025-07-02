import java.util.ArrayList;

public class User{
    ArrayList<User> userlist = new ArrayList<User>();
    boolean admin;
    String name;
    int login;

     public User(String name, int login, boolean admin){
        this.name = name;
        this.login = login;
        this.admin = admin;
    }



}