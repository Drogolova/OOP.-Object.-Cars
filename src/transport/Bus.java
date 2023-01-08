package transport;

public class Bus extends Transport<BusDriver> {
    BusCapacityType capacityType;

    public Bus(String brand, String model, double engineVolume /* String color, int year, String country, int maxSpeed*/, BusDriver driver, BusCapacityType capacityType)
            throws WrongDriverLicenseException {
        super(brand, model, engineVolume /*color, year, country, maxSpeed*/, driver);
        this.capacityType = capacityType;
    }

    public BusCapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(BusCapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacityType);
        }
    }

    @Override
    public void passDiagnostic() {
        throw new UnsupportedOperationException("Автобусы диагностику проходить не могут");
    }
}

