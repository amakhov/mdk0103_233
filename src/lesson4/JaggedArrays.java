package lesson4;

public class JaggedArrays {
    // зубчатые массивы (Jagged Arrays)
    public static void main(String[] args) {
        // шаг1. создание основного (внешнего) массива
        int[][] jaggedArray = new int[3][];
        // шаг2. создание и заполнение внутренних массивов (подмассивы)
        jaggedArray[0] = new int[2]; // 2 элемента в первой строке
        jaggedArray[1] = new int[4]; // 4 элемента во второй строке
        jaggedArray[2] = new int[3]; // 3 элемента в третьей строке
        // внутренние массивы - это обычные массивы
        // шаг3. заполнение значениями
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;

        jaggedArray[2][0] = 7;
        jaggedArray[2][1] = 8;
        jaggedArray[2][2] = 9;

        // быстрая инициализация
        int [][] jaggedArray2 = new int[][] {
          new int[] {1,2},
          new int[] {3,4,5,6,7},
          new int[] {8,9,10}
        };

        // перебор и работа с зубчатыми массивами
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Строка " + i + ":" );
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        /*
        когда зубчатые массивы могут быть полезнее двухмерных
        - если вы храните для каждого пользователя разное кол-во каких-то данных
        (оценки по предметам, покупки, комментарии и т.д.
        - если ваши данные имею треугольную или ступенчатую структуру
        - если хотите экономить память (в двумерном массиве все строки фиксированы
        а в зубчатом - только нужное кол-во элементов
         */

        // трехмерные и многомерные массивы
         int [][][] cube = new int[2][3][4];
        /*
        - 2 - элементы по первой координате
        - 3 - по второй
        - 4 - по третьей
         */


    }
}
