package creational.builder;

public interface Builder {
    void setType(String type);
    void setColor(String color);
    void setTransmission(String transmission);
    void setMaxSpeed(Integer maxSpeed);
}
