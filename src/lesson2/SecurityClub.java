package lesson2;

import java.util.Scanner;

public class SecurityClub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vipCode = 5075;
        // String promocode = "OPEN25"; - в разработке
        System.out.print("Введите ваш возраст ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Добро пожаловать!");
            System.out.println("Введите ваш код для VIP-zone ");
            int userInputCode = input.nextInt();
            // метод equals для сравнение строк (текстовой информации)
            if (vipCode == userInputCode) {
                System.out.println("Вам открыт доступ в Vip зону");
            } else {
                System.out.println("Код неверный!");
            }
        } else {
            System.out.println("Вход запрещен!");
        }

    }
}
