package creational.builder;

public class TransportBuilder implements Builder{
    private String type;
    private String color;
    private String transmission;
    private Integer maxSpeed;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transport getResult() {
        Transport transport = new Transport(type, color, transmission);
        if(maxSpeed != null){
            transport.setMaxSpeed(maxSpeed);
        }
        return transport;
    }

}
