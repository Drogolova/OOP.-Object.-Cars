package transport;

public class Truck extends Transport<TruckDriver> {

    TruckLoadCapacityType loadCapacityType;

    public Truck(String brand, String model, double engineVolume, TruckDriver driver, TruckLoadCapacityType loadCapacityType) {
        super(brand, model, engineVolume, driver);
        this.loadCapacityType = loadCapacityType;
    }

    public TruckLoadCapacityType getLoadCapacityType() {
        return loadCapacityType;
    }

    public void setLoadCapacityType(TruckLoadCapacityType loadCapacityType) {
        this.loadCapacityType = loadCapacityType;
    }

    @Override
    public void printType() {
        if (loadCapacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(loadCapacityType);
        }
    }
}
