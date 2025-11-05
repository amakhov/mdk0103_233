package hometask2;
/*
i - этаж
j - квартира

"1 этаж 1 квартира"
...
"10 этаж 50 квартира!"
floor - i
flat - j
 */

public class Courier {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++)
                if (i > 1) {
                    for (j = i * 5 - 4; j <= 5*i; j++)
                        System.out.println(i + " этаж " + j + " квартира");
                }
        }
    }
}
