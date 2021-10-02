package creational.builder;

public class Car extends Transport{
    protected String type;
    protected String color;
    protected String transmission;

    Car(String type, String color, String transmission) {
        super(type, color, transmission);
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
