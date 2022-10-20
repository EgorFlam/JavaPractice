public class StringExpirients_Part_2 {
    public static void main(String[] args) {
        /** Задание #2:
         * Возьмите английский текст (не менее 100 слов) и напишите программу, которая будет разбивать его на слова и
         * печатать слова в консоли. Знаки препинания не являются частью слова.
         */

        String text = "I live in a house near the mountains. I have two brothers and one sister, and " +
                "I was born last. My father teaches mathematics, and my mother is a nurse at a big hospital. " +
                "My brothers are very smart and work hard in school. My sister is a nervous girl, but she is " +
                "very kind. My grandmother also lives with us. She came from Italy when " +
                "I was two years old. She has grown old, but she is still very strong. She cooks the best food!";
        /**
         * удаляем всю пунктуацию ([!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]) внутри текста с помощью символьного класса [\pP].
         * // ДЛЯ СПРАВКИ: символьный класс [\w] спользуется для удаления буквенного текста, не затрагивая пунктуацию
         */
        String word = text.replaceAll("[\\pP]", "");

        /**
         * делим текст на слова по пробелам и результат выводим в виде массива
         */
        String[] wordWithoutPunct = word.split("\\s+");

        /**
         * распечатаем массив строк с помощью цикла for
         */
        for (int i = 0; i < wordWithoutPunct.length; i++) {
            /**
             * выводим на печать каждое слово.
             */
            System.out.println(wordWithoutPunct[i]); //
        }
    }
}
