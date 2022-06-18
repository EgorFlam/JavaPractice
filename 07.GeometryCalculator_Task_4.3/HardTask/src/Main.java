import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вы доставляете гуманитарную помощь в ящиках одинакового размера.
        // У вас есть грузовики и контейнеры. В каждый грузовик помещается
        // максимум 12 контейнеров (Грузовки => 12 контейнеров). В каждый контейнер — не более 27 ящиков
        // (Контейнер => 27 ящиков). Ящики, контейнеры и грузовики пронумерованы.

        //Напишите программу, которая распределит ящики по контейнерам и грузовикам в
        // зависимости от их количества. Программа должна выводить необходимое
        // для этого число грузовиков и контейнеров.Грузовики, контейнеры, ящики
        //
        //

        //Принцип работы программы:
        //Указываем число ящиков — получаем результат в виде строк:
        //Грузовик 1:
        //Контейнер 1:
        //      Ящик 1
        //      Ящик 2
        //      Ящик 3
        //      …
        //  Контейнер 2
        //      Ящик 28
        //      Ящик 29
        // …
        //Необходимо:
        //грузовиков — 1 шт.
        //контейнеров — 10 шт.

        Scanner scanner = new Scanner(System.in); //Считывать число из консоли будем через Scanner

        final int MAX_CONTAINERS_IN_TRUCK = 12;
        final int MAX_BOXES_IN_CONTAINER = 27;

        int truck = 0; //порядковый номер грузовика
        int container = 0; //порядковый номер контейнера

        System.out.print("Сколько нужно ящиков: ");  //получение количество ящиков от пользователя
        int boxes = scanner.nextInt();

        //TODO: вывести в консоль ящики, разложенные по грузовикам и контейнерам
        //для отступа используйте таьуляцию  - \t

        if (boxes == 0) {
        } else if (boxes < MAX_BOXES_IN_CONTAINER) {
            container++;
            truck++;
            System.out.println("Грузовки: " + System.lineSeparator() + "\tКонтейнер: " + container);
        } else if (boxes > MAX_BOXES_IN_CONTAINER) {
            container++;
            truck++;
            System.out.println("Грузовки: " + System.lineSeparator() + "\tКонтейнер: " + container);
        }
        for (int i = 1; i <= boxes; i++) {
            System.out.println("\t\tЯщик: " + i);
            if (i % (MAX_BOXES_IN_CONTAINER * MAX_CONTAINERS_IN_TRUCK) == 0) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }
            if (i % MAX_BOXES_IN_CONTAINER == 0) {
                if (i != boxes) {
                    container++;
                    System.out.println("\tКонтейнер: " + container);
                }
            }
        }
        System.out.println("Необходимо: " + System.lineSeparator() + "грузовиков - " + truck +
                " шт." + System.lineSeparator() + "контейнеров - " + container + " шт.");
                /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}
