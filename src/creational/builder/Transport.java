package creational.builder;

public class Transport {
    protected String type;
    protected String color;
    protected String transmission = "manual";
    protected int maxSpeed = 1;

    Transport(String type, String color, String transmission){
        this.type = type;
        this.color = color;
        this.transmission = transmission;
        if(this.transmission == null){
            this.transmission = "manual";
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
