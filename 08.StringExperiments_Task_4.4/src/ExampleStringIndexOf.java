public class ExampleStringIndexOf {
    public static void main(String[] args)
        {
//            метод indexOf() класса String
//            Метод indexOf() ищет в строке заданный символ или строку возвращает индекс первого вхождения.
//            Если вхождения не найдено возвращает -1
//            Есть перегруженный метод который ищет вхождение строки с указанного индекса

//            создадим строковую переменную в которой будет искать вхождения
            String phrase = "Цени в себе свинец";

//            с помощью метода расапечатаем строку и под каджым символом его индекс в строке
            printWithIndexes(phrase);

//            попробуем найти в строке символ 'е'
            final char ERu = 'e';
            int index = phrase.indexOf('e');
            System.out.printf("Первое вхождение символа '%s' находится по индексу %d%n", ERu, index);

//            попроубем поискать строку "свинец"
//            обратите внимание, что возращается индекс первого символа строки, то есть 'c'
            String plumbum = "свинец";
            int indexPlumbum = phrase.indexOf(plumbum);
            System.out.printf("Вхождение строки \"%s\" не найдено, вернулся индекс %d%n", plumbum, indexPlumbum);

            // поиск символа с заданного начального индекса
            char CRu = 'c';
            int startIndex = 8;
            int indexC = phrase.indexOf(CRu, startIndex);
            System.out.printf("Вхождение символа \"%s\" после индекса %d найдено, вернулся индекс %d%n%n", CRu, startIndex, indexC);

            // с помощью этого метода можно найти все индексы вхождения строки
            // вы можете менять значения part и смотреть как работает метод
            String tongueTwister = "Мы ели-ели ершей у ерли. Их еле-еле у если доели.";
            String part = "ели";

            printWithIndexes(tongueTwister);
            System.out.printf("Вхождения строки \"%s\" найдена на индексах: ", part);

            int partIndex = -part.length();
            for (; ;) {
                partIndex = tongueTwister.indexOf(part, partIndex + part.length());
                if (partIndex == -1) {
                    break;
                }
                System.out.println(partIndex + " ");
            }

        }

//    private static void printWithHooks(String string){
//        System.out.printf("[%s]%n", string);
//    }

        private static void printWithIndexes(String string){
            StringBuilder letters = new StringBuilder().append("char: ");
            StringBuilder indexes = new StringBuilder().append("index:");
            for (int i = 0; i < string.length(); i++) {
                letters.append(String.format("%3s", string.charAt(i)));
                indexes.append(String.format("%3d", i));
            }
            System.out.println(letters);
            System.out.println(indexes.append(System.lineSeparator()));
        }
}
