public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int moneyStart = 0;
        int deposit = 15000;
        int month = 0;
        int totalMoney = 2_459_000;
        while (moneyStart <= totalMoney) {
            moneyStart += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + moneyStart + " рублей");
            month++;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();



    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int years = 10;
        for (int i = 1; i <= years; i++) {
            population += (population / 1000 * (fertility - mortality));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        double deposit = 15000;
        double percentPerMonth = 0.07;
        int totalMoney = 12_000_000;
        int month = 1;

        while (deposit <= totalMoney) {

            deposit *= (1 + percentPerMonth);
            System.out.println("Месяц " + month + " Итого накоплений " + deposit);
            month++;

        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        double deposit = 15000;
        double percentPerMonth = 0.07;
        int totalMoney = 12_000_000;
        int month = 1;

        while (deposit <= totalMoney) {

            deposit *= (1 + percentPerMonth);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого накоплений " + deposit);
            }
            month++;
        }
        System.out.println("Месяц " + month + " Итого накоплений " + deposit);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        double deposit = 15000;
        double percentPerMonth = 0.07;

        for (int month = 1; month <= 9 * 12; month++) {

            deposit *= (1 + percentPerMonth);

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого накоплений " + deposit);
            }

        }

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }
}