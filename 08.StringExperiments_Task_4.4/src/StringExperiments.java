import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {

        String s1 = "the best Java Core course is CourseCodeGym. End of story";
        String myTarget = "CodeGym";
        int index1 = s1.indexOf(myTarget);
        int index2 = index1 + myTarget.length();
        System.out.println(s1.substring(index1, index2));
        for (int i = 0; i < myTarget.length(); i++) {
            for (int j = i + 1; j <= myTarget.length(); j++){
                System.out.println(myTarget.substring(i, j));
            }
        }
        System.out.println("====================================================\nЗадание №1");

//        //Задание №1
//        //Распечатайте коды всех букв английского алфавита и сами буквы.
        for (char i = 'A'; i <= 'Z'; i++) {
            int c = i;
            System.out.println(i + " :" + c + ".");
        }
        System.out.println("-----------------------------------------------------");

        for (char i = 'А'; i <= 'Я'; i++) {
            int c = i;
            System.out.println(i + " :" + c + ".");
        }
        System.out.println("====================================================\nЗадание №2");

        //Задание №2
        //Напишите код в проекте StringExperiments, который считает сумму заработка
        // всех друзей (Васи, Пети и Маши). Используйте методы indexOf(), lastIndexOf(), substring() и trim().

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        printWithIndexes(text);

        System.out.println("Сумма заработка друзей: " + getSalary(text)); // без использования регулярных выражений

        // или с использованием регулярных выражений

        int sum = 0; // создадим переменную
        for (String word: text.split(" ")) {
            // split - делим строку на части через пробелы
                //Создание блоков кода, для которых мы предусматриваем
                // обработку исключений в Java, производится в программе с помощью конструкций try{}catch.
                // При возбуждении исключения в блоке try{} обработчик исключения ищется в следующем за ним блоке catch{}.
                // Если в catch есть обработчик данного типа исключения – управление переходит
                // к нему. Если нет, то JVM ищет обработчик этого типа исключения в
                // цепочке вызовов методов до тех пор, пока не будет найден подходящий catch{}.
            try {
                // try – определяет блок кода, в котором может произойти исключение;
                sum += Integer.parseInt(word);
                // преобразуем строку в число через Integer.parseInt, для проведения арифмитических операций
            } catch (NumberFormatException ignored) {
                // catch – определяет блок кода, в котором происходит обработка исключения;
                // "NumberFormatException ignored" - игнорим NumberFormatException, чтобы избежать/исключить ошибку при
                // попытке конвертировать строку в число, используя метод Integer.parseInt().
            }
        }
        System.out.println("Сумма заработка друзей: " + sum);

        System.out.println("====================================================\nЗадание №3");

        //Задание №3
        //Напишите программу, которая на входе через консоль принимает фамилию, имя и отчество одной строкой (например,
        // «Иванов Сергей Петрович») и выводит фамилию, имя и отчество отдельно
        // в формате:
        //Фамилия:  Иванов
        //Имя:      Сергей
        //Отчество: Петрович

        for (; ;) { // запустим запрос строки в бесконечном цикле
            System.out.println("Введите ваши ФИО (фамилия, имя отчество). Для выхода введите \"q\".");
            // сразу удаляем пробелы после получения строки, так как trim() возвращает копию String к которой применяется метод
            String input = new Scanner(System.in).nextLine().trim();
            if (input.equals("q")) {
                break;
            } else {
                // split - делим строку на части через пробелы
                String[] splitString = input.split(" ");
                // После разделения строки результат возвращается в виде массива строк. Строки в возвращаемом массиве появляются в том же
                // порядке, что и в исходной строке. Результаты упаковываются в массив String. Чтобы получить отдельные имена,
                // мы можем получить доступ к каждому элементу:
                System.out.println("Фамилия: " + splitString[0]);
                System.out.println("Имя: " + splitString[1]);
                System.out.println("Отчество: " + splitString[2]);
            }
        }
    }

    private static void printWithIndexes(String string){ // Данный метод наглядно позволяет распознать где какой элемент
            // в строке и под каким порядковым номером он находится в строке
        StringBuilder letters = new StringBuilder().append("char: ");
        StringBuilder indexes = new StringBuilder().append("index:");
        for (int i = 0; i < string.length(); i++) {
            letters.append(String.format("%3s", string.charAt(i)));
            indexes.append(String.format("%3d", i));
        }
        System.out.println(letters);
        System.out.println(indexes.append(System.lineSeparator()));
    }

    private static String getSalary(String salary) { // без использования регулярных выражений

        // определяем габариты будущей подстроки
        String vasyaStr = "заработал";
        int vasyaStart = salary.indexOf(vasyaStr);
        int vasyaEnd = salary.indexOf("рублей", vasyaStart);

        // определяем габариты будущей подстроки
        String petyaStr = "-";
        int petyaStart = salary.indexOf(petyaStr);
        int petyaEnd = salary.indexOf("рубля", petyaStart);

        // определяем габариты будущей подстроки
        String mashaStr = "Маша -";
        int mashaStart = salary.indexOf(mashaStr);
        int mashaEnd = salary.indexOf("рублей", mashaStart);

        String vasyaSalary = salary.substring(vasyaStart + vasyaStr.length(), vasyaEnd).trim(); // вычленение подстроки
        // и  + ее форматирование (убираем лишние пробелы по краям)
        String petyaSalary = salary.substring(petyaStart + petyaStr.length(), petyaEnd).trim(); // вычленение подстроки
        // и  + ее форматирование (убираем лишние пробелы по краям)
        String mashaSalary = salary.substring(mashaStart + mashaStr.length(), mashaEnd).trim(); // вычленение подстроки
        // и  + ее форматирование (убираем лишние пробелы по краям)

        int vasya = Integer.parseInt(vasyaSalary); // преоброзование строкового значения в число
        int petya = Integer.parseInt(petyaSalary); // преоброзование строкового значения в число
        int masha = Integer.parseInt(mashaSalary); // преоброзование строкового значения в число

        Integer sum = (vasya + petya + masha); // арифмитическое действие над числами
        String total = sum.toString(); // преоброзование числового значения в строку
        return (total); // возвращаем результат
    }
}
