package lesson1;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        // ввод с клавиатуры
        // System.in
        // создание объекта Scanner под названием console
        Scanner console = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = console.nextLine();
        System.out.print("Введите ваш возраст: ");
        int age = console.nextInt();

        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}
