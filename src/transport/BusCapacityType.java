package transport;

public enum BusCapacityType {
    VERY_SMALL(null, 10),
    SMALL(null,25),
    MIDDLE(40, 50),
    LARGE(60, 80),
    VERY_LARGE(100, 120);
        private final Integer min;
        private final Integer max;

    BusCapacityType(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

        @Override
        public String toString() {
            if (min == null) {
                return "Вместимость: " +
                        "до " + max + " мест";
            }
            if (max == null) {
                return "Вместимость: " +
                        "от " + min + " мест";
            } else {
                return "Вместимость: " + "от " + min +
                        " до " + max + " мест";
            }
        }
}
