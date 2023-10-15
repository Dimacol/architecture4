public abstract class Car {
    String brand;
    String model;
    int weels;
    FuelType fuelType; 
    Transmition transmitionType;

    Car(String brand, String model, Transmition transmitionType, int numWeels, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.transmitionType = transmitionType;
        this.weels = weels;
        this.fuelType = fuelType;
    }

    abstract void move();

    abstract void service();

    abstract void turnOnHeadlights();
}
