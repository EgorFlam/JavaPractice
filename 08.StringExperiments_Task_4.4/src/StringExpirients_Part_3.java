import java.util.Scanner;

public class StringExpirients_Part_3 {
    public static void main(String[] args) {
// Реализуйте  удаление лишних символов при вводе номера телефона в консоли и проверку
// соответствия номера формату мобильных номеров России. Если введённую строку нельзя
// привести к формату мобильного номера — выводите сообщение о неверном вводе. Телефон
// может быть введен не только в формате 79091234567, но и с лишними символами.
        /**
         * Запустим строки в бесконечном цикле
         **/
        for (; ;) {
            System.out.println(
                    "Введите номер телефона в международном формате (11 символов в номере; код страны - 7). " +
                            "Для выхода из программы введите \"q\"."
            );
            String input = new Scanner(System.in).nextLine().trim(); // уберем пробелы в начале и в конце строки

            /**
             * Пропишем условие, для выхода/завршения программы
             **/
            if (input.equals("q")) {
                break;
            }

            /**
             * Приведем номер телефона к нужному формату:
             * В квадратных скобках [] указываем диапазон символов от 0 до 9. Знак ^ - это символ отрицания.
             * То есть выражение в квадратных скобках ^0-9 звучит так: ВСЕ СИМВОЛЫ КРОМЕ ОТ 0 ДО 9 заменится на параметр,
             * который указан в коде (replacement).
             **/
            String digits = input.replaceAll("[^0-9]", "");

            /**
             * Задаем условия для 10-значного тел.номера, начинающегося с 9, чтобы потом преобразовать номер в
             * 11-значный номер, котрый будет начинаться с 7.
             */
            if (digits.length() == 10 && (digits.startsWith("9"))) {
                System.out.println('7' + digits);
                continue;
            }

            /**
             * Условие проверки, если номер 11-значный и начинается с "8".
             */
            if (digits.length() == 11 && digits.startsWith("8")) {
                System.out.println('7' + digits.substring(1));
                continue;
            }

            System.out.println("Ooops. Please try again... :-)");
        }
    }
}