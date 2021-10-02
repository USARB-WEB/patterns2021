package creational.builder;

public class Director {
    public void createRedBus(Builder builder){
        builder.setType("bus");
        builder.setColor("red");
    }

    public void createRedBusAutomaticTransmission(Builder builder){
        builder.setType("bus");
        builder.setColor("red");
        builder.setTransmission("automatic");
    }

    public void createGreenBus(Builder builder){
        builder.setType("bus");
        builder.setColor("green");
    }

    public void createRedCar(Builder builder){
        builder.setType("car");
        builder.setColor("red");
    }

    public void createWhiteCar(Builder builder){
        builder.setType("car");
        builder.setColor("white");
    }

    public void createFastRedBus(Builder builder){
        builder.setType("bus");
        builder.setColor("pink");
        builder.setMaxSpeed(1000);
    }
}
