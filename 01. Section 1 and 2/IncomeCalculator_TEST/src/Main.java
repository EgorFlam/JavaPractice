import java.util.Scanner; //инициализация сканера для считывания

public class Main {
    private static int minIncome = 200000; // Минимальная прибыль компании
    private static int maxIncome = 900000; // Максимальная прибыль компании

    private static int officeRentCharge = 140000; // Ежемесячнвая плата за аренду офиса
    private static int telephonyCharge = 12000; // абон плата за телефон
    private static int internetAccessCharge = 7200; // абон плата за инернет

    private static int assistantSalary = 45000; // зарплата ассистента
    private static int financeManagerSalary = 90000; //зарплата бугалтера

    private static double mainTaxPercent = 0.24; //Процент налога
    private static double managerPercent = 0.15; // Процент менеджера

    private static double minInvestmentsAmount = 100000; // Минимальный порог инвестирования

    public static void main(String[] args) {
        int minIncomeForInvests = (int) ((minInvestmentsAmount + calculateFixedCharges() * (1 - mainTaxPercent)) / ((1 - mainTaxPercent) * (1 - managerPercent)) + 1); //расчёт минимальной суммы дохода для инвестирования
        System.out.println("Минимальный доход для инвестиций: " + minIncomeForInvests); //вывод минимальной суммы дохода для инвестирования

        while (true) {
            System.out.println("Введите сумму доходов компании за месяц " + "(от 200 до 900 тысяч рублей): ");  //вывод запроса на ввод
            int income = (new Scanner(System.in)).nextInt(); //Получаем значение с командной строки

            if (!checkIncomeRange(income)) { //условие выполняется если сумма доходов компании за месяц в пределах заданного диапазона
                continue;
            }

            double managerSalary = income * managerPercent; //зарплата менеджера сумма доходов*Процент менеджера
            double pureIncome = income - managerSalary - calculateFixedCharges(); // чистый доход компании
            double taxAmount = mainTaxPercent * pureIncome; // сумма налога
            double pureIncomeAfterTax = pureIncome - taxAmount; // доход комапании после уплаты налогов

            boolean canMakeInvestments = pureIncomeAfterTax >= minInvestmentsAmount; // присвоение true если
            // прибыль больше либо равна минимальному порогу инвестирования


            System.out.println("Зарплата менеджера: " + managerSalary); //отображение зарплаты менеджера
            System.out.println("Общая сумма налогов: " + (taxAmount > 0 ? taxAmount : 0)); //вывод суммы
            // налогов если есть чистый доход
            System.out.println("Компания может инвестировать: " + (canMakeInvestments ? "да" : "нет")); //выводит может ли
            // компания инвестировать (на основании строки 37)
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!"); //выводится если чистая прибль меньше 0
            }
        }
    }

    private static boolean checkIncomeRange(int income) { //проверка суммы доходов компании за месяц
        if (income < minIncome) { //проверка нижнего значения
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) { //проверка верхнего значения
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() { //подсчёт постоянных расходов
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}


