package lesson4;

public class LessonArray2 {
    public static void main(String[] args) {
        // двухмерные массивы
        // тип [][] имяМассива;
        int [][] matrix;

        double [][] table;
        // cоздание массива
        // задаем размер количество строк и столбцов
        matrix = new int[3][4];
        /*
        0 0 0 0
        0 0 99 0
        0 0 0 0
         */
        int [][] matrix2 = new int[5][5];
        int [][] example = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // каждый элемент задается парой индексов [строка, столбец]
        matrix[1][2] = 99;

        // заполнение двухмерного массива
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix2[i][j] = value;
                value++;
            }
        }

        // вывод двухмерного массива
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + "\t"); // \t - табуляция
            }
            System.out.println();
        }



    }
}
