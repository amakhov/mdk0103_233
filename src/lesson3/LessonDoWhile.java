package lesson3;

import java.util.Scanner;

public class LessonDoWhile {
    public static void main(String[] args) {
        /*
        do-while
        do {
            // тело цикла, это код выполняется хотя бы один раз
        } while (условие);
         */

        int count = 0;
        while (count > 0) {
            System.out.println("count = " + count);
            count--;
        }
        // ничего не выведется

        // do-while
        int count2 = 0;
        do {
            System.out.println("count2 = " + count2);
        } while (count2 > 0);

        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("Введите новый пароль(не менее 6 символов");
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println("Пароль принят!");

        // меню в консольный приложениях
        int command;
        do {
            System.out.println("Меню:");
            System.out.println("1. Показать приветствие");
            System.out.println("2. Выйти");
            System.out.print("Выберите действие: ");
            command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Привет!");
            } else if (command == 2) {
                System.exit(0);
            }
        } while(!(command==1) || !(command==2));

        /*
        while
        - проверка условия (до)
        - выполнение тело цикла - 0 и более раз
        - когда заранее неизвестно число повторений

        for
        - проверка условия (до)
        - выполнение тело цикла - 0 и более раз
        - когда известно количество итераций (повторений)

        while-do
        - проверка условия (после)
        - выполение тело цикла - 1 и более раз
        - когда важно выполнить тело цикла хотя бы один раз
         */


    }
}
