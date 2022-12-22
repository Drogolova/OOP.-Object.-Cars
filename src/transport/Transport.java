package transport;

public class Transport {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed) {
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
        if(color == null || color.isBlank()) {
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
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
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
    }

    @Override
    public String toString() {
        return "Марка - " + brand +
                ", модель - " + model +
                ", год выпуска - " + year +
                ", страна производства - " + country +
                ", цвет кузова - " + color +
                ", максимальная скорость передвижения - " + maxSpeed + " км/ч";
    }
}
