package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        /*
        дробные числа
        -float - точность (примерно 7 знаков после запятой) - 4 байта
        -double - точность (примерно 15-16 знаков после запятой) - 8 байт
         */
        double pi = 3.1415926;
        double x = 0.1 + 0.2; // 0.3
        System.out.println(x);

        // автоматическое и явное преобразование
        int i = 2;
        double d = i;
        System.out.println(d);

        double dd = 3.7;
        int ii = (int) dd; // явное преобразование
        System.out.println(ii);

        // форматирование и вывод на экран
        double temp = 23.53664445363;
        System.out.println(temp);
        System.out.println(String.format("%.2f", temp));
        System.out.printf("%.3f", temp);
        System.out.println();

        // типичные ошибки с вещественными числами
        float f = 1.23f; // с float всегда добавляем суффикс f

        int a = 7, b = 2; // деление двух int - результат будет int
        double result = (double) a / b; // 3.5
        System.out.println(result);

        System.out.println(x == 0.3);

        double res = 0;
        for(int i1 = 0; i1 < 10; i1++) {
            res = res + 0.1;
        }
        System.out.println(res); // 0.9999999999999999
        System.out.println(Math.round(res));

        // Math
        // округление до ближайшего числа
        System.out.println(Math.round(2.3)); // 2
        System.out.println(Math.round(2.5)); // 3
        // Math.floor(значение) - округляет в меньшую сторону
        // Math.ceil(значение) - округляет в большую строну
        System.out.println(Math.floor(2.5)); // 2

    }
}
