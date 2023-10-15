public class BMW extends Car{

    public int aditionalWeels;

    public BMW(String model, Transmition transmitionType, int numWeels, int aditionalWeels, FuelType fuelType) {
        super("BMW", model, transmitionType, numWeels,fuelType);
        this.aditionalWeels = aditionalWeels;
    }

  
    @Override
    void move() {
        System.out.println("BMW is flying");
    }

    @Override
    void service() {
        System.out.println("BMW is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}

