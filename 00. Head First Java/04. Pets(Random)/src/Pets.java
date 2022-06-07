public class Pets {
    public static void main(String[] args) {
        String[] pets = {"Фидо", "Зевс", "Бин"};
        int x = pets.length;
        int random = (int) Math.random() * pets.length; //(int) - используем приведение дробного числа к цеолочислительному int
        String s = pets[0]; // s — теперь строка со значением "Фидо"
        s = s + " " + "- собака"; // s теперь имеет значение "Фидо — собака"
        System.out.println(s + ";" + " length: " + x);
    }
}
