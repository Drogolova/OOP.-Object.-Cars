package transport;

public class TruckDriver extends Driver {
    public TruckDriver(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории C " + name;
    }
}
