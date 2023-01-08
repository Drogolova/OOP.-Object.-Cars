package transport;

public enum TruckLoadCapacityType {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float min;
    private final Float max;

    TruckLoadCapacityType(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Грузоподъёмность: " +
                    "до " + max + " тонн";
        }
        if (max == null) {
            return "Грузоподъёмность: " +
                    "от " + min + " тонн";
        }
        else {
            return "Грузоподъёмность: " +
                "от " + min  + " тонн" +
                "до " + max + " тонн";
        }
    }
}
