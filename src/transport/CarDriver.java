package transport;

public class CarDriver extends Driver {
    public CarDriver(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории B " + name;
    }
}
