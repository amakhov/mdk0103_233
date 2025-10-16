package lesson3;

import java.util.Random;
import java.util.Scanner;

public class RockerTask {
    public static void main(String[] args) {
        // Запустили ракету в космос, она бесконечно летает
        // Чтобы прервать ее полет и вернуть на Землю,
        // пилоту нужно ввести код - число от 0 до 10;
        // Проблема - код обновляется, когда ракета сделала полный круг
        // Когда пилот отгадывает число - полет прерывается

        int pilotInput;
        int secretCode;
        int attempt = 3;
        Random random = new Random(); // генерирует случайное число
        Scanner scanner = new Scanner(System.in);

        // while (true) - бесконечный цикл
        while (true) {
            secretCode = random.nextInt(10);
            System.out.println("Ракета начала новый круг");
            System.out.print("Введите код для отправки домой ");
            pilotInput = scanner.nextInt();
            if(pilotInput == secretCode) {
                System.out.println("Мы летим домой!");
                break; // полный выход из цикла
            }
            attempt--;
            if(attempt==0) {
                System.out.println("Сработала система самоуничтожение");
                break;
            }
        }
    }
}
