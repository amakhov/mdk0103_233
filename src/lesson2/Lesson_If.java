package lesson2;

import java.util.Scanner;

public class Lesson_If {
    public static void main(String[] args) {
        // условный оператор if else
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userNumber = userInput.nextInt();
        // if (условие) истинно, то выполняем
        // команду 1
        if (userNumber > 0) {
            System.out.println("положительное число");
        } else if (userNumber == 0){
            System.out.println("число 0");
        } else {
            System.out.println("отрицательное число");
        }
    }
}
