package transport;

public class BusDriver extends Driver {
    public BusDriver(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории D " + name;
    }
}
