package transport;

public class Truck extends Transport<TruckDriver> {

    public Truck(String brand, String model, double engineVolume, TruckDriver driver) {
        super(brand, model, engineVolume, driver);
    }

}
