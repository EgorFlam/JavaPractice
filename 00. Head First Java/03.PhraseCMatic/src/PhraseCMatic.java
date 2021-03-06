public class PhraseCMatic {
    public static void main(String[] args) {
        // Создайте три набора слов для выбора Добавляйте собственные слова!
        String[] wordListOne = {"круглосуточный", "трех-звенный","30000-футовый", "взаимный", "обоюдный выйгрыш",
                "фронтенд", "на основе вэб технологий", "проникающий", "умный", "шесть сигм", "метод критического пути",
                "динамичный"};

        String[] wordListTwo = {"уолносоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластерезованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный",
                "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структруры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пукт иследования"};

        //Вычиляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случаных чила
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
