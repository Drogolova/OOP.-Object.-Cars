package transport;

public enum CarBodyType {
    SEDAN ("Седан"),
    HATCHBACK ("Хетчбек"),
    COUPE ("Купе"),
    STATION_WAGON ("Универсал"),
    OFF_ROAD_CAR ("Внедорожник"),
    CROSSOVER ("Кроссовер"),
    PICKUP ("Пикап"),
    VAN ("Фургон"),
    MINIVAN ("Минивэн");

    private final String bodyType;

    CarBodyType(String bodyType) {

        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType;
    }
}
