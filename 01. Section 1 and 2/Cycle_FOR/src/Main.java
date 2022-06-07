public class Main {

    public static void main(String[] args) {
        int secondsBeforeStart = 70

        System.out.println("Это первый этаж дома, который построил Джек.");
        // Вместо многоточий добавьте нужные значения
        for (int floor = 2; floor < 11; floor = floor + 1) {
            System.out.println("А это " + floor + " этаж, он на один выше, чем этаж " + (floor -1));//Место для вывода
        }
    }
}