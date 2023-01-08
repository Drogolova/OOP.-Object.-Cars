package transport;

public abstract class Transport<T extends Driver> implements Competitive {
    protected final String brand;
    protected final String model;
    protected final double engineVolume;

    protected final T driver;

   /* protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed; */

    public Transport(String brand, String model, /*, String color, int year, String country, int maxSpeed*/double engineVolume, T driver) {
        if(brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if(model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if(engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
       /* if(color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if(year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        this.maxSpeed = maxSpeed; */
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    /*public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    } */

    @Override
    public String toString() {
        return "Марка - " + brand +
                ", модель - " + model +
                ", объём двигателя - " + engineVolume/* +
                ", год выпуска - " + year +
                ", страна производства - " + country +
                ", цвет кузова - " + color +
                ", максимальная скорость передвижения - " + maxSpeed + " км/ч" */;
    }

    public void startMoving() {
        System.out.println("Движение начато");
    }

    public void endMoving() {
        System.out.println("Движение закончено");
    }

    @Override
    public void pitStop() {
        System.out.println("Выполняется пит-стоп");
    }

    @Override
    public void bestTimeCircle() {
        System.out.println("Лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }

    public String getDriverInfo() {
        return driver.toString() + " управляет автомобилем " + this.toString() + " и будет участвовать в заезде";
    }

    public abstract void printType();
}
