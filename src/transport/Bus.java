package transport;

public class Bus extends Transport<BusDriver> {

    public Bus(String brand, String model, double engineVolume /* String color, int year, String country, int maxSpeed*/, BusDriver driver) {
        super(brand, model, engineVolume /*color, year, country, maxSpeed*/, driver);
    }
}
