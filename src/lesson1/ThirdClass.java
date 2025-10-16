package lesson1;

import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {
        Scanner userEnter = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number1 = userEnter.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = userEnter.nextDouble();
        double result = number1 + number2;

        System.out.println("Результат: " + number1 + " + " +
                number2 + " = " + result);
    }
}
