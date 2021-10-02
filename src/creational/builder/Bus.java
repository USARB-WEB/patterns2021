package creational.builder;

public class Bus extends Transport{
    protected String type;
    protected String color;
    protected String transmission;


    Bus(String type, String color, String transmission) {
        super(type, color, transmission);
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
