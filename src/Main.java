public class Main {
    public static void main(String[] args) {
        task1();

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

}