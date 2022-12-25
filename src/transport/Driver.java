package transport;

public class Driver {
   protected String name;
   protected boolean driverLicense;
   protected int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println("Движение начато");
    }

    public void endMoving() {
        System.out.println("Движение закончено");
    }

    public void pitStop() {
        System.out.println("Выполняется пит-стоп");
    }
}
