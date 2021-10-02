package creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        TransportBuilder builder = new TransportBuilder();

        director.createRedBus(builder);
        Transport busManual = builder.getResult();

        director.createRedBusAutomaticTransmission(builder);
        Transport busAutomatic = builder.getResult();

        director.createFastRedBus(builder);
        Transport fastRedBus = builder.getResult();

        System.out.println(busManual);
        System.out.println(busAutomatic);
        System.out.println(fastRedBus);
    }
}
