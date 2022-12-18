import transport.Car;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("",
                null,
                1.7,
                "жёлтый",
                2015,
                "",
                "Автоматическая",
                "Седан",
                "А628МН125",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusYears(2), BigDecimal.valueOf(4000), "123456789")
        );
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", -1, "чёрный", 2020, "Германия", "Автоматическая", "Хэтчбек", "А158ВЕ658", 8, false);
        Car car3 = new Car("BMW", "Z8", 3.0, null, 2021, "Германия", "Автоматическая", "Хэтчбек", "С875ИХ198", 8, false);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "Механическая", "Седан", "У874ЕМ365", 5, true);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 0, "Южная корея", "Механическая", "Седан", "М547ОП254", 5, true);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}