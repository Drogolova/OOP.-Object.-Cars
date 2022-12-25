import transport.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Audi", "A8", 1.7, new CarDriver("Иван", true, 2));
        Car car2 = new Car("BMW", "Z8", 2.4, new CarDriver("Петр", true, 2));
        Car car3 = new Car("Kia", "Sportage", 1.6, new CarDriver("Дима", true, 2));
        Car car4 = new Car("Hyundai", "Avante", 2.1, new CarDriver("Степа", true, 2));

        Bus bus1 = new Bus("Volvo", "7900", 5.1, new BusDriver("Иван", true, 2));
        Bus bus2 = new Bus("МАЗ", "245", 4.8, new BusDriver("Петр", true, 2));
        Bus bus3 = new Bus("МАЗ", "364", 5.5, new BusDriver("Дима", true, 2));
        Bus bus4 = new Bus("Volvo", "B12", 5.2, new BusDriver("Степа", true, 2));

        Truck truck1 = new Truck("Nissan", "Atlas", 3.8, new TruckDriver("Иван", true, 2));
        Truck truck2 = new Truck("Scania", "S500", 4.1, new TruckDriver("Петр", true, 2));
        Truck truck3 = new Truck("Volvo", "FL7", 3.5, new TruckDriver("Дима", true, 2));
        Truck truck4 = new Truck("Volkswagen", "L80", 4.0, new TruckDriver("Степа", true, 2));

        car1.startMoving();
        car1.pitStop();
        bus1.bestTimeCircle();
        truck1.maxSpeed();

        System.out.println(car1.getDriverInfo());
        System.out.println(bus1.getDriverInfo());
        System.out.println(truck1.getDriverInfo());

        /* Car car1 = new Car("", null, 1.7, "жёлтый", 2015, "", "Автоматическая", "Седан",
                "А628МН125", 5, true, new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusYears(2), BigDecimal.valueOf(4000), "123456789"),
                110
        );
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", -1, "чёрный", 2020, "Германия", "Автоматическая", "Хэтчбек", "А158ВЕ658", 8, false, 150);
        Car car3 = new Car("BMW", "Z8", 3.0, null, 2021, "Германия", "Автоматическая", "Хэтчбек", "С875ИХ198", 8, false, 200);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "Механическая", "Седан", "У874ЕМ365", 5, true, 180);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 0, "Южная корея", "Механическая", "Седан", "М547ОП254", 5, true, 170);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5); */

        /* Bus bus1 = new Bus("Volvo", "7900", "белый",2009,  "Германия", 200);
        Bus bus2 = new Bus("МАЗ", "245", "красный", 2015,  "Россия",  190);
        Bus bus3 = new Bus("Маз", "364", "жёлтый",2012,   "Россия", 180); */

        /*System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);*/
    }
}