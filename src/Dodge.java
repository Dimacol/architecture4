public class Dodge extends Car{

    public int aditionalWeels;

    public Dodge(String model, Transmition transmitionType, int numWeels, int aditionalWeels, FuelType fuelType) {
        super("Dodge", model, transmitionType, numWeels,fuelType);
        this.aditionalWeels = aditionalWeels;
    }

  
    @Override
    void move() {
        System.out.println("Dodge is moving");
    }

    @Override
    void service() {
        System.out.println("Dodge is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}