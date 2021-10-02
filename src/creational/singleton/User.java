package creational.singleton;

public class User {
    private String username = "noname";
    private static User instance = null;

    private User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                " username='" + username + '\'' +
                " hashcode=" + this.hashCode() +
                '}';
    }

    public static User getInstance(String username){
        if(User.instance == null){
            User.instance = new User(username);
        }
        return User.instance;
    }
}
