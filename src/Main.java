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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " год является високостным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int bankDeposit = 0;
        int monthlyPayment = 29000;
        for (int i = 1; i < 13; i++) {
            bankDeposit += monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bankDeposit + " рублей");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
        double bankDeposit = 0;
        int monthlyPayment = 29000;
        double monthlyDepositInterest = 0.01;
        System.out.println(monthlyDepositInterest);
        for (int i = 1; i < 13; i++) {
            bankDeposit += bankDeposit * monthlyDepositInterest;
            bankDeposit += monthlyPayment;
            String str = String.format("%.2f", bankDeposit);
            // округляем до 2 знаков после запятой(округление используем только для вывода информации, но не для расчетов)
            String rub = str.substring(0, str.length() - 3);
            // оставляем только рубли
            String kop = str.substring(str.length() - 2);
            // откидываем все кроме копеек
            System.out.println("Месяц " + i + ", сумма накоплений равна " + rub + " рублей " + kop + " копееек");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10");
        int result = 0;
        int multiplier = 2;
        for (int i = 1; i <= 10; i++) {
            result = multiplier * i;
            System.out.println(multiplier + "*" + i + "=" + result);
        }
        System.out.println();
    }
}