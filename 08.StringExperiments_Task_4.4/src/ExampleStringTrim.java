import java.util.Locale;
import java.util.Scanner;

public class ExampleStringTrim {
    public static void main(String[] args) {
        /**
        метод класса String
        trim()
        метод возвращает копию данной строки, в которой удаляются начальные и конечные пробелы,
        или данную строку, если она не имеет начальных или конечных пробелов.
         */

        // создадим строковую переменную в которой будут пробелы в начале и конце строки
        String phrase =  "     Луна́ — единственный естественный спутник Земли     ";

        // распечатаем строку, заключив ее в скобках для наглядности
        printWithHooks(phrase);

        // создадим новуюстроку, в которую сохраним результат выполения trim()
        String phraseWithoutSpaces = phrase.trim();

        // распечатаем строку без пробелов, заключив ее в скобках для наглядности
        printWithHooks(phraseWithoutSpaces);

        // метод trim() применяется, например, для очистки от пробелов входных данных от пользователя
        // запустим запрос строки в бесконечном цикле
        for (; ;) {
            System.out.println("Введите строку с пробелами в конце и в начале (для выхода введите Q):");

            // сразу удаляем пробелы после получения строки, так как trim() возвращает копию String к которой применяется метод
            String input = new Scanner(System.in).nextLine().trim();

            System.out.println("Ваша строка после удаления пробелов:");
            printWithHooks(input);

            if (input.equals("Q")) {
                break;
            }
        }
    }

    private static void printWithHooks(String string) {
        System.out.printf("[%s]%n", string);
    }
}
