package transport;

public class Car extends Transport<CarDriver> implements Competitive{
    public Car(String brand, String model, double engineVolume, CarDriver driver) {
        super(brand, model, engineVolume, driver);
    }
}
    /* private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int sitAmount;
    private boolean isWinterRubber;
    private Key key;
    private Insurance insurance; */

   /* public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keyFreeAccess;

        public Key(boolean remoteRunEngine, boolean keyFreeAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keyFreeAccess = keyFreeAccess;
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeyFreeAccess() {
            return keyFreeAccess;
        }

        @Override
        public String toString() {
            return "удалённый запуск двигателя: " + (remoteRunEngine ? "да" : "нет") +
                    ", бесключевой доступ: " + (keyFreeAccess ? "да" : "нет");
        }
    } */

    /*public static class Insurance {
        private final LocalDate endDate;
        private final BigDecimal price;
        private final String number;

        private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        public Insurance(LocalDate endDate, BigDecimal price, String number) {
            this.endDate = endDate != null ? endDate : LocalDate.now().plusYears(1);
            this.price = price != null ? price : new BigDecimal(0);
            this.number = number != null ? number : "-";
        }

        public LocalDate getEndDate() {
            return endDate;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public boolean endDateValid() {
            return LocalDate.now().compareTo(endDate) < 0;
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }

        @Override
        public String toString() {
            return "срок действия страховки: " + endDate.format(df) +
                    ", цена: " + price +
                    ", номер страховки: " + number;
        }
    } */

    /*public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int sitAmount, boolean isWinterRubber, Key key, Insurance insurance, int maxSpeed) {
        this(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, sitAmount, isWinterRubber, maxSpeed);
        this.insurance = insurance;
        this.key = key;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int sitAmount, boolean isWinterRubber, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
        if(engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.sitAmount = sitAmount;
        this.isWinterRubber = isWinterRubber;

    }

    @Override
    public String toString() {
        return  "марка - " + brand +
                ", модель - " + model +
                ", объём двигателя - " + engineVolume + " литра" +
                ", цвет - " + color +
                ", год производства - " + year +
                ", коробка передач - " + transmission +
                ", тип кузова - " + bodyType +
                ", количество сидений - " + sitAmount +
                ", тип резины - " + (isWinterRubber ? "зимняя" : "летняя") +
                ", гос номер - " + registrationNumber + "(" + (isNumberValid() ? "валидный" : "невалидный") + ")" +
                ", ключ(" + (key != null ? key.toString() : "не определён") + ")" +
                ", страховка(" + (insurance != null ? insurance.toString() : "нет страховки") + ").";
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSitAmount() {
        return sitAmount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {

        this.registrationNumber = registrationNumber;
    }

    public boolean isWinterRubber() {
        return isWinterRubber;
    }

    public void setWinterRubber(boolean winterRubber) {
        isWinterRubber = winterRubber;
    }

    public boolean changeRubber() {
        int season = LocalDate.now().getMonth().getValue();
        if(season == 1 || season == 2 || season == 11 || season == 12) {
            return true;
        }
        return false;
    }

    public boolean isNumberValid() {
        boolean valid = true;
        if (registrationNumber == null || registrationNumber.length() != 9) {
            return false;
        }
        valid = valid && isCharValid(registrationNumber.charAt(0));
        valid = valid && isCharValid(registrationNumber.charAt(4));
        valid = valid && isCharValid(registrationNumber.charAt(5));
        valid = valid && Character.isDigit(registrationNumber.charAt(1));
        valid = valid && Character.isDigit(registrationNumber.charAt(2));
        valid = valid && Character.isDigit(registrationNumber.charAt(3));
        valid = valid && Character.isDigit(registrationNumber.charAt(6));
        valid = valid && Character.isDigit(registrationNumber.charAt(7));
        valid = valid && Character.isDigit(registrationNumber.charAt(8));
        return valid;
    }

    private boolean isCharValid(char c) {
        return "АВЕКМНОРСТУХ".contains(String.valueOf(c));
    }
} */
