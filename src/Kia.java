public class Kia extends Car{

    public int aditionalWeels;

    public Kia(String model, Transmition transmitionType, int numWeels, int aditionalWeels, FuelType fuelType) {
        super("Kia", model, transmitionType, numWeels,fuelType);
        this.aditionalWeels = aditionalWeels;
    }

  
    @Override
    void move() {
        System.out.println("Kia is moving");
    }

    @Override
    void service() {
        System.out.println("Kia is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}