package lesoon_oop;

public class Application {
    public static void main(String[] args) {

        /* создание объекта
        ТипДанных название = new ТипДанных();
         */
        Tiger vasya = new Tiger("Вася", 110, true);
        Tiger vasilisa = new Tiger("Василиса", 80.6, false);
        Tiger petya = new Tiger("Петр", true);

        petya.printOnlyName();
        // вызов метода через точку
        vasya.printName();
        vasilisa.printName();

//        vasya.eat();
//
//        vasya.name = "Вася";
//        vasya.weight = 110;
//        vasya.isMale = true;
//
//        vasilisa.name = "Василиса";
//        vasilisa.weight = 80;
//        vasilisa.isMale = false;



        // 2 орла, 3 слона
        Eagle pelmen = new Eagle();
        Eagle raviol = new Eagle();


//        pelmen.name = "Пельмень";
//        pelmen.weight = 20;
//        pelmen.isRedBook = false;
//        raviol.name = "Равиоль";
//        raviol.weight = 15;
//        raviol.isRedBook = true;


    }
}
