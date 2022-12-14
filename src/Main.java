public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("", null, 1.7, "жёлтый", 2015, "");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", -1, "чёрный", 2020, "Германия");
        Car car3 = new Car("BMW", "Z8", 3.0, null, 2021, "Германия");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 0, "Южная корея");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}