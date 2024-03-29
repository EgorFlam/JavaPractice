public class StringExpirients_Part_1 {
    public static void main(String[] args) {
        String name1 = "Gena";
        String name2 = "Max";
//конконтенация строк (name1 + name2) занимает очень много время и памяти, то есть малоэфективно
// можно убедиться в этом на примере ниже:
/*
       long start = System.currentTimeMillis(); //узнаем затраченное время на операцию конконтенацию (сложение строк) ДО цикла

        for (int i = 0; i < 50000; i++) { // создадим цикл для конконтенации
            name1 += name2;
        }
        long end = System.currentTimeMillis(); //узнаем затраченное время на операцию конконтенацию (сложение строк) ПОСЛЕ цикла

        System.out.println("Duration: " + (end - start) + " ms"); //вычеслим разницу
        System.out.println(name1.length()); //узнаем длину стороки
*/

/**
 * Чтобы меньше затрачивать время и ресурсы машины, есть класс StringBuilder, который позволяет добовлять к нему строки
 * таким образов, что это не приводит к созданию нового объекта и переписыания старого объекта в новый.
 */
        StringBuilder builder= new StringBuilder(); //создаем пустой builder
        builder.append(name1); //добавим к builder строку name1 методом append

        long start = System.currentTimeMillis(); //узнаем затраченное время на операцию конконтенацию (сложение строк) ДО цикла

        for (int i = 0; i < 50000; i++) { // создадим цикл для конконтенации
            builder.append(name2); //добавим к builder еще строку name2 методом append
        }
        long end = System.currentTimeMillis(); //узнаем затраченное время на операцию конконтенацию (сложение строк) ПОСЛЕ цикла

        System.out.println("Duration: " + (end - start) + " ms"); //вычеслим разницу
        System.out.println(builder.length()); //узнаем длину стороки

//РЕГУЛЯРНЫЕ ВЫРАЖЕНИЯ
        //#1
        String phone = "+7 (905) 223-45-67"; //Введем номер телефона в произвольном формате

        /**
         * приведем номер телефона к нужному формату. В квадратных скобках [] указываем диапазон символов от 0 до 9.
         * Знак ^ - это символ отрицания. То есть выражение в квадратных скобках ^0-9 звучит так: ВСЕ СИМВОЛЫ КРОМЕ ОТ 0
         * ДО 9 заменится на параметр, который указан в коде (replacement).
         */
        System.out.println(phone.replaceAll("[^0-9]", ""));

        //#2
        String text = "Дмитрий Петрович ждет Вас.         Пожалуйста выходите через 5 минут!";

        /**
         * разделим текс на строки, используя метод split, задав соответствующие параметры
         */
        String[] sentences = text.split("\\.\\s+");

        /**
         * результат возвращается в виде массива строк, используя квадратные скобки[] перед объектом обозначение
         * \\s+ - символ s означает space(пробел), знак + означает от 1 и до бесконечного количества раз может
         * встречаться символ
         */
        for (int i = 0; i < sentences.length; i++) { //распечатаем массив строк с помощью цикла for
            System.out.println(sentences[i]); // в квадратных скобках можно задавать номер элемента, начиная с 0.
        }
    }
}
