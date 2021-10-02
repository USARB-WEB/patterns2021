package creational.singleton;

public class Main {
    public static void main(String[] args) {
        User user = User.getInstance("Mihai");
        User userNew = User.getInstance("Ion");

        System.out.println(user);
        System.out.println(userNew);
    }
}
