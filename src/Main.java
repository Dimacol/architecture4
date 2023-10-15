

public class Main {

   
    public static void main(String[] args) {
  
        Lada vesta = new Lada("Vesta", Transmition.auto, FourWeelCar.numWeels,1, FuelType.benzin);
        vesta.move();
        vesta.service();
        BMW flymashine = new BMW("FlyMashine", Transmition.manual, FlyСar.numWeels,0 , FuelType.gas);
        flymashine.move();
        Kia rio = new Kia ("Rio", Transmition.manual, FourWeelCar.numWeels, 1, FuelType.diesel);
        rio.move();
        Dodge moose = new Dodge ("Moose", Transmition.manual, FourWeelCar.numWeels, 4, FuelType.benzin);
        moose.move();
        moose.turnOnHeadlights();
        
         }

} 
    