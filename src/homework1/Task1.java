package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число месяца");
        Scanner userInput = new Scanner(System.in);
        int userMonth = userInput.nextInt();
        if (userMonth >12 || userMonth <1){
            System.out.println("некоректное число");
        } else if (userMonth == 6 ||userMonth==7||userMonth==8) {
            System.out.println("Лето");
        } else if (userMonth == 3 ||userMonth==4||userMonth==5) {
         System.out.println("Весна");
        } else if (userMonth ==9 ||userMonth==10||userMonth==11){
            System.out.println("Осень");
        }else if (userMonth==12 ||userMonth==1||userMonth==2){
            System.out.println("Зима");
        }
    }
}
