package lesson3;

import java.util.Scanner;

public class BlockSmartphone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "4056";
        int attempt = 3;
        // будем хранить введеные пользователем текст
        String userInput = "";

        // запрашиваем пароль,
        while ((!password.equals(userInput))) {
            System.out.print("Введите пароль: ");
            userInput = input.nextLine();
            attempt--;
            if (attempt == 0) {
                System.out.println("Смартфон заблокирован!");
                System.exit(0);
            }
        }
        System.out.println("Смартфон разблокирован");
    }
}
