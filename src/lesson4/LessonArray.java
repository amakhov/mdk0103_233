package lesson4;

import java.util.Scanner;

public class LessonArray {
    // массивы - контейнеры элементов
    /*
     Массив - упорядоченный набор элементов, каждый из которых
     хранит одно значение, идентифицируемое с помощью одного или
     несколько индексов.

     Синтаксис массива:
     типДанных[] названиеМассива = new типДанных[кол-во элементов];

     */

    public static void main(String[] args) {
        // создание массива под название array на 10 целых чисел
        int[] array = new int[10];
        // создание массива под название array2 на 20 веществ чисел
        double[] array2 = new double[20];
        // создание массива под название array3 на 5 строк
        String[] array3 = new String[5];

        // работа с ячейками массива
        // нумерация всегда начинается с нуля.
        // если массив на 10 элементов, то индексы у него от 0..9
        array[0] = 56;
        array[5] = 425;
        array[9] = 446;
        array[8] = array[0] + array[5];

        // array.length - определяет длину массива
        // вывод массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + " - элемент массива = " + array[i]);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array3.length; i++) {
            System.out.print("Введите текст: ");
            array3[i] = scanner.nextLine();
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        // быстрая инициализация массива
        int[] scores = new int[] {44, 42,60,21,33,11,55,22,11,55,57,3};
        // цикл for-each
        // проход по всем элементам массива

        for(int i : scores) {
            System.out.println("Баллы: " + i);
        }

        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("Сумма баллов: " + sum);
        System.out.println("Максимальный балл: " + max);
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]< min) {
                min = scores[i];
            }
        }
        System.out.println("Минимальный балл: " + min);

    }
}
