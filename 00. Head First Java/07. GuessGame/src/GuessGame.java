public class GuessGame { //Содержит три переменных экземплярова для трех объектов Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); // Создаем три объекта Player и присваиваем их трем переменным экземпляра
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // Объявляем три переменные для хранения вариантов от каждого игрока
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //Объявляем три переменных для хранения правильности или неправильности (true
        boolean p2isRight = false; // или false) оветов игроков.
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // Создаем число, которое игроки должны угадать
        System.out.println("Я загадываю число от 0 до 9 ...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);
            p1.guess(); // Вызываем метод guess() из каждого объекта Player
            p2.guess();
            p3.guess();

            guessp1 = p1.number; // Извлекаем варианты каждого игрока (результаты работы их методов guess()), получая
            System.out.println("Первый игрок думает, что это " + guessp1); // доступ к их переменным number.

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { // Если первый ИЛИ второй ИЛИ третий игрок угадал (оператор || означает ИЛИ)
                System.out.println("У меня есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры.");
                break; //Игра окончена, прерываем цикл
            } else { // Иначе остаемся в цикле и просим игроков сделать еще одну прктику.
                // Мыдолжны продолжить так как никто не угадал!
                System.out.println("Игроки должны попробовать еще раз");
            }
        }
    }
}

