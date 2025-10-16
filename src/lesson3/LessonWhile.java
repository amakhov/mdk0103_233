package lesson3;

public class LessonWhile {
    public static void main(String[] args) {
        // циклы: while, for, do-while
        // while
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;

        int i = 1; // счетчик
        while (i <= 5) { // while (условие) - условие выхода из цикла
            System.out.println("Шаг № " + i);
            i++; // i = i + 1 - не забываем увеличить счетчик!
        }

        // бесконечный цикл
        //while (true) {
        //    System.out.println("Я вечный");
        // }

        int countDown = 10;
        while (countDown >= 1) {
            System.out.println("До старта осталось " + countDown + " секунд");
            countDown--;
        }
        System.out.println("Полетели!");

    }
}
