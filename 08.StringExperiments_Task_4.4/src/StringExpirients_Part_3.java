import java.util.Scanner;

public class StringExpirients_Part_3 {
    public static void main(String[] args) {
// Реализуйте  удаление лишних символов при вводе номера телефона в консоли и проверку
// соответствия номера формату мобильных номеров России. Если введённую строку нельзя
// привести к формату мобильного номера — выводите сообщение о неверном вводе. Телефон
// может быть введен не только в формате 79091234567, но и с лишними символами.
        for (; ;) { // запустим строки в бесконечном цикле
            System.out.println("Введите номер телефона в международном формате (11 символов в номере; код страны - 7). " +
                    "Для выхода из программы введите \"q\".");
            String input = new Scanner(System.in).nextLine().trim(); // уберем пробелы в начале и в конце строки

            if (input.equals("q")) { //пропишем условие, чтобы выхода/завршения программы
                break;
            } else {
                String digits = input.replaceAll("[^0-9]", ""); //приведем номер телефона к нужному формату.
                // В квадратных скобках [] указываем диапазон символов от 0 до 9. Знак ^ - это символ отрицания. То есть выражение в квадратных
                // скобках ^0-9 звучит так: ВСЕ СИМВОЛЫ КРОМЕ ОТ 0 ДО 9 заменится на параметр, который указан в коде (replacement).
                if (digits.length() == 10 && (digits.charAt(0) == '9')) {
                    digits = '7' + digits.substring(0);
                }

                if (digits.length() == 11 && (digits.charAt(0) == '7' || digits.charAt(0) == '8'))
                    {
                        if (digits.charAt(0) == '8') {
                            digits = '7' + digits.substring(1);
                        }
                        if (digits.charAt(0) == '9') {
                            digits = '7' + digits.substring(1);
                        }
                       System.out.println(digits);
                    } else {
                        System.out.println("Ooops. Please try again... :-)");
                    }
                }
        }
    }
}