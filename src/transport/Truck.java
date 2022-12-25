package transport;

public class Truck extends Transport<TruckDriver> implements Competitive{

    public Truck(String brand, String model, double engineVolume, TruckDriver driver) {
        super(brand, model, engineVolume, driver);
    }

}
