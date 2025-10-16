package lesson1;

public class FirstClass {
    // горячие клавиши psvm
    // точка входа в программу метод main
    public static void main(String[] args) {
        // вывод на экран
//        System.out.println("Привет");
//        System.out.println("Саша");
        String name = "Саша";
        System.out.println("Привет " + name);

        // тип данных Integer - целое число (-2_147_483_648 - 2_147_483_647)
        // тип данных Byte (-128 - 127)
        // тип данных Short (-32768 - 32767)
        // тип данных Long
        // целое число
        int a = 20;
        int b = 7;

        // числа с плавающей точкой - тип данных Float и Double
        // float (32 бит = 4 байта)
        // double (64 бит = 8 байт)

        double c = 0.4;
        double f = 0.9;
        System.out.println(c + f);

        // логический тип данных
        // boolean (32 бит) - true, false
        int d = 55;
        int t = 55;
        System.out.println(d >= t);
        System.out.println(d == t); //равенство
        System.out.println(d != t); // неравно

        System.out.println(a / b); //целочисленное деление
        System.out.println(a % b); // отстаток по модулю

        // Константы
        // отличие от переменных константам можно присвоить значение один раз
        // в Java константы верхнем регистре
        final int LIMIT = 5;

        // символьный тип char (один символ)
        // char - одинарные кавычки - String - двойные
        // \n - перевод строки
        // \t - табуляция
        System.out.println('\n');
        System.out.println("hello");
        System.out.println('\u4691');
        System.out.println('\u260E');

    }
}
