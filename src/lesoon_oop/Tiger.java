package lesoon_oop;

public class Tiger {
    // поля, переменные, характеристики
    // все поля класса принято делать приватными
    private String name;
    private double weight;
    private boolean isMale;

    // конструктор - это метод для создания объкта
    // во всех классах есть конструктор
    // - конструктор по умолчанию public Tiger() {}
    // - создать объект new Tiger()

    public Tiger(String name, int weight, boolean isMale){
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
    }

    public Tiger(String name, boolean isMale) {
        this.name = name;
        this.weight = 0;
        this.isMale = isMale;
    }

    public Tiger(String name, double weight, boolean isMale){
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
    }


    // метод (в Java) в других языках програм-е - функции

    void printOnlyName() {
        System.out.println(name);
    }

    void printName () {
        System.out.println("Имя тигра - " + name);
        System.out.println("Вес тигра - " + weight);
        if (isMale) {
            System.out.println("Пол - мужской");
        } else {
            System.out.println("Пол - женский");
        }
    }

    void eat() {
        System.out.println("Я поел");
    }


}
