public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    //   Домашнее задание 1,
    //   Задание 1
    //   С помощью цикла for выведите в консоль все числа от 1 до 10
    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //  Задание 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //  Задание 3
        //  Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i=i+2) {
            System.out.println(i);
        }
        //  Задание 4
        //Выведите в консоль все числа от 10 до - 10 от большего числа к меньшему.
        System.out.println("Задание 4");
        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i);

        }

    }
        // Домашнее задание 2.
        // Задание 1
        //Напишите программу, которая выводит в консоль все високосные года,
        // начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате "… год является високосным".

    public static void task2() {
        // Задание 1
        System.out.println("Задание 1");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "год является високосным");
            }

        }
        // Задание 2
        // Напишите программу, которая выводит в консоль последовательность цифр:
        //
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Задание 2");
        for (int i = 7; i <= 98 ; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 3 
        // Напишите программу, которая выводит в консоль последовательность цифр:
        //
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Задание 3");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

        // Домашнее задание 3
    }
    public static void task3() {
        // Задание 1
        //Посчитайте с помощью цикла for сумму годовых накоплений,
        // если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        //
        //Выведите сумму накоплений за каждый месяц в консоль
        // в формате "Месяц … , сумма накоплений равна … рублей" .
        System.out.println("Задание 1");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12 ; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений = " + sum +  "рублей");
        }
        //  Перепишите решение задачи выше при условии,
        //  что деньги вы откладывать будете не "в банку",
        //  а в банк под проценты – 12% годовых.
        //  Выведите сумму накоплений за каждый месяц в консоль
        //  в формате "Месяц … , сумма накоплений равна … рублей" .
        // Задание 2
        System.out.println("Задание 2");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12 ; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений = " + sumWithPercent + " рублей");
        }
        // Альтернативное решение задачи 1 и 2
        System.out.println("Альтернативное решение задачи 1 и 2");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12 ; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений = " + total +  "рублей");
        }
        System.out.println(total);
    }

}