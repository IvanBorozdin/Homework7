public class Main {
    public static void main(String[] args) {
        tasks1();
        tasks2();
        tasks3();
        tasks4();
        tasks5();
        tasks6();
        tasks7();
        tasks8();

        System.out.println();

    }

    public static void tasks1() {
        System.out.println("Задания 1");

        int salary = 15000;
        int total = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + salary;
            int i = total / salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void tasks2() {
        System.out.println("Задания 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int a = 10; a >= 1; a = a - 1) {

            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void tasks3() {
        System.out.println("Задания 3");
        int y = 12000000;
        int birthRate = 17;
        int mortality = 8;

        birthRate = y / 1000 * birthRate;
        mortality = y / 1000 * mortality;

        for (int i = 1; i <= 10; i = i + 1) {
            y = y + birthRate - mortality;
            System.out.println("Год " + i + " .Чисто населения состовляет" + y);
        }


    }

    public static void tasks4() {
        System.out.println("Задания 4");
        int salary = 15000;
        int total = 0;
        for (int i = 0; total <= 12000000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void tasks5() {
        System.out.println("Задания 5");
        int salary = 15000;
        int total = 0;
        for (int i = 0; total <= 12000000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }

        }
    }

    public static void tasks6() {
        System.out.println("Задания 6");
        int salary = 15000;
        int total = 0;
        for (int i = 0; i <= 9 * 12; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void tasks7() {
        System.out.println("Задания 7");
        int friday = 2;
        for (int i = friday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница," + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void tasks8() {
        System.out.println("Задания 8");
        int a = 2023;
        int b = 200;
        int d = 100;
        int c = a - b;
        int n = a + d;
        for (int k = a; k < n; k = k + 79) {
            System.out.println(k);
        }
             for (int i = a; i > c; i = i - 79) {
                  System.out.println(i);
    }


}
 }