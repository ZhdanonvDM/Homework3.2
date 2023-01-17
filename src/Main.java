import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача № 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер опеационной системы (0 — iOS, 1 — Android): ");
        byte clientOS = in.nextByte();
        System.out.print("Установлена система ");
        if (clientOS == 0) {
            System.out.println("iOS");
        }
        else System.out.println("Android");
    }
    public static void task2 () {
        System.out.println("Задача № 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер опеационной системы (0 — iOS, 1 — Android): ");
        byte clientOS = in.nextByte();
        System.out.print("Введите год производства вашего телефона: ");
        short clientDeviceYear = in.nextShort();
        if (clientDeviceYear>2015) {
            if (clientOS == 0) {
                System.out.println("установите iOS");
            } else System.out.println("установите Android");
        }
        else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    public static void task3 () {
        System.out.println("Задача № 3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        short year = in.nextShort();
        System.out.print("Год является ");

        if (year % 4 != 0){
            System.out.println("невисокосным");}
        else if (year % 400 == 0) {
            System.out.println("високосным");
        }
        else if (year % 100 == 0) {
            System.out.println("невисокосным");
        }
        else {
            System.out.println("високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача № 4");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дистанцию до клиента: ");
        short deliveryDistance = in.nextShort();
        System.out.print("Потребуется дней: ");

        if (deliveryDistance<20){
            System.out.println("1");}
        else if (deliveryDistance<60 && deliveryDistance>20) {
                System.out.println("2");
            }
        else if (deliveryDistance<100 && deliveryDistance>60) {
            System.out.println("3");
        }
        else {
            System.out.println("доставка не осуществляется");
        }
    }
    public static void task5 () {
        System.out.println("Задача № 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        byte monthNumber = in.nextByte();
        System.out.print("Это месяц ");
        switch (monthNumber) {
            case 1:
                System.out.println("январь, принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("февраль, принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("март, принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("апрель, принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("май, принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("июнь, принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("июль, принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("август, принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("сентябрь, принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("октябрь, принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("ноябрь, принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("декабрь, принадлежит к сезону зим");
                break;
            default:
                System.out.println(" - отсутствует");
        }
    }
}