package lesson3;

public class Elevator {
    public static void main(String[] args) {
        // 70 этажный небоскреб
        // просторная 5-уровняя парковка
        int floor;
        for (floor = -5; floor <= 20; floor++ ) {
            if (floor == 0) {
                continue;
            }
            System.out.println("Этаж " + floor);
        }

    }
}
