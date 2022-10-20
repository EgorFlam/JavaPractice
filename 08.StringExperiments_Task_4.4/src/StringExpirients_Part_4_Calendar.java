import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StringExpirients_Part_4_Calendar {
    public static void main(String[] args) throws ParseException {
        /**
         * Напишите программу, которая покажет прошедшие дни вашего рождения от нуля лет до текущего времени в формате:
         * возраст, дата и день недели.
         * Формат требуемого вывода:
         *     0 - 31.12.1990 - Mon
         *     1 - 31.12.1991 - Tue
         *     …
         */
        /** ПЕРВЫЙ ВАРИАНТ: ввод данных через консоль
         ЗАМЕТКА: SimpleDateFormat  позволит форматировать все создаваемые объекты Date и Calendar для последующего использования.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату вашего рождения в формате (день/месяц/год)");

        /** Заменим любой нецифровой символ спомощью "\\D" на точку через регулярные выражения, попутно уберем лишние
         пробелы в начале/конце ввода данных
         */
        String input = scanner.nextLine().trim().replaceAll("\\D", ".");

        Calendar startDate = Calendar.getInstance(); //Создадим класс "Calendar", для работы с датой из консоли

        /** Будем форматировать данные из консоли из String в Date с помощью вспомогательного класса — SimpleDateFormat.
         */
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        /** Вызовим метод set() и передадим в него константу из консоли, попутно ее отформатировав
         */
        startDate.setTime(format1.parse(input));

        /** Будем использовать класс SimpleDateFormat, чтобы вывести дату в более понятном нам формате, то есть
         укажим дни недели (полностью)
         */
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy - EEEE");

        /** Создами еще одн класс Calendar() для текущей даты для выполнения услвоий проверки
         */
        Calendar currentDate = Calendar.getInstance();

        /**
         * Прописываем условие для введенной даты
         */
        if (startDate.after(currentDate)) {
            System.out.println("Введенная дата не наступила");
        }
        else {
            while (startDate.before(currentDate)) {
                /** Будем выводить на печать каждый год по условию цикла
                 */
                System.out.println(df.format(startDate.getTime()));

                /** Прибавление значения в классе "Calendar" осуществляется с помощью метода "add()", то есть чтобы прибавить
                  один год к дате, введенной в консоли, в метод нужно передать положительное число, а чтобы отнять
                  значение - в метод нужно передать отрицательное число.
                 */
                startDate.add(Calendar.YEAR, 1);
            }
        }
        /**
         * ВТОРОЙ ВАРИАНТ: ввод данных через переменные типа int:
         * int day = 10;
         * int month = 7;
         * int year = 1985;
         */
//        int day = 10;
//        int month = 7;
//        int year = 1985;
//
//            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE ");
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(Calendar.MONTH, month -1);
//            calendar.set(Calendar.DAY_OF_MONTH, day);
//            calendar.set(Calendar.YEAR, year);
//
//        Calendar date = Calendar.getInstance();
//        if (calendar.after(date)) {
//            System.out.println("Введенные данные не корректны");
//        } else {
//            while (calendar.before(date)) {
//                System.out.println(dateFormat.format(calendar.getTime()));
//                calendar.add(Calendar.YEAR, 1);
//            }
//        }
    }
}
