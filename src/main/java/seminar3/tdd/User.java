package seminar3.tdd;

public class User {

    boolean isAdmin;
    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        isAuthenticate = (name.equals(this.name)) && (password.equals(this.password));
        return isAuthenticate;
    }

}