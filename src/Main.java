public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int moneyStart = 0;
        int deposit = 15000;
        int month = 0;
        int totalMoney = 0;
        while (totalMoney <= 2_459_000) {
            totalMoney = moneyStart + deposit * month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2"); 

    }
}