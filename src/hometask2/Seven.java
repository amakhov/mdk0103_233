package hometask2;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите количество моющего средства");
        double  washes = userInput.nextDouble();
        System.out.println("Введите количество тарелок");
        int tarelki = userInput.nextInt();
        while (tarelki > 0) {
            tarelki = tarelki - 1; // tarelki--
            washes = washes - 0.5;
            System.out.println("Осталось тарелок " + tarelki );
            System.out.println("Осталось средства " + washes);
            if (washes < 0.5 ){
                System.out.println("Закончилось средство");
                System.out.println("Осталось тарелок " + tarelki );
                break;
            }
        }
    }
}
