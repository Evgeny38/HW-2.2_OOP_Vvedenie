import hw221.Human;
import hw221.Car;
public class Main {
    public static Human[] humans = new Human[5] ;
    public static Car[] cars = new Car[5] ;
    public static void main(String[] args) {
        System.out.println("Список каких-то абсолютно разных людей:");
        Human human1 = new Human("Максим", 35, "Минск", "Брэнд-менеджер");
        Human human2 = new Human("Аня", 29, "Москва", "Методист образовательных программ");
        Human human3 = new Human("Катя", 28, "Калининград", "Продакт-менеджер");
        Human human4 = new Human("Артём",27 , "Москва", "Директор по развитию бизнес-систем");
        Human human5 = new Human();


        humans[0] = human1;
        humans[1] = human2;
        humans[2] = human3;
        humans[3] = human4;
        humans[4] = human5;


        printHuman();
        System.out.println();
        human3.setName("Снежанна");
        human1.setJob("   ");
        human2.setAge(null);
        System.out.println(human3);
        System.out.println(human1);
        System.out.println(human2);

        System.out.println();

        System.out.println("Восставшие машины: ");
        Car car1 = new Car("LADA","GRANTA",1.7,"жёлтый",2015,"Россия");
        Car car2 = new Car("AUDI","A8 50L TDI quattro",3.0,"чёрный",2020,
                "Германия");
        Car car3 = new Car("BMW","Z8",3.0,"чёрный",2021,"Германия");
        Car car4= new Car("KIA","SPORTAGE 4",2.4,"красный",2018,
                "Южная Корея");
        Car car5 = new Car("HYUNDAY","AVANTE",1.6,"оранжевый",2016,
                "Южная Корея");
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        printCar();
        System.out.println();
        car1.setBrand(null);
        System.out.println(car1);

    }
    public static void printHuman() {
            for (Human human : humans) {
                System.out.println(human);
            }

    }
    public static void printCar() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}