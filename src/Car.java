public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
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
    }

    @Override
    public String toString() {
        return  "марка - " + brand +
                ", модель - " + model +
                ", объём двигателя - " + engineVolume + " литра" +
                ", цвет - " + color +
                ", год производства - " + year +
                ", страна сборки - " + country + ".";
    }
}
