public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задача 2: Проверка года устройства


        int clientDeviceYear = 2015;

        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");


        }
//Задача 3

        int year = 2025; // Можно подставить любой год

        if (year <= 1584) {
            System.out.

                    println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.

                    println(year + " год является високосным");
        } else {
            System.out.

                    println(year + " год не является високосным");
        }
// Задача 4

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.

                    println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.

                    println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.

                    println("Потребуется дней: 3");
        } else {
            System.out.

                    println("Доставка не осуществляется");
        }
//задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.

                        println("Январь");

                break;
            case 2:
                System.out.

                        println("Февраль");

                break;
            case 3:
                System.out.

                        println("Март");

                break;
            case 4:
                System.out.

                        println("Апрель");

                break;
            case 5:
                System.out.

                        println("Май");

                break;
            case 6:
                System.out.

                        println("Июнь");

                break;
            case 7:
                System.out.

                        println("Июль");

                break;
            case 8:
                System.out.

                        println("Август");

                break;
            case 9:
                System.out.

                        println("Сентябрь");

                break;
            case 10:
                System.out.

                        println("Октябрь");

                break;
            case 11:
                System.out.

                        println("Ноябрь");

                break;
            case 12:
                System.out.

                        println("Декабрь");

                break;
            default:
                System.out.

                        println("Такого месяца не существует");

        }


    }
}



