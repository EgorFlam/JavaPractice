public class Main
{
    public static void main(String[] args)
    {
        int moneyAmount = 13;

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;

        boolean moneyEnoughForCapucino = moneyAmount >= cappucinoPrice;

        boolean canBuyAnything = false;

        if (moneyEnoughForCapucino && isMilkEnough)
        {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }
        if (moneyAmount >= lattePrice && isMilkEnough)
        {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }
        if (moneyAmount >= espressoPrice)
        {
            System.out.println("Вы можете купить эсперссо");
            canBuyAnything = true;
        }
        if (moneyAmount >= waterPrice)
        {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }
        if (!canBuyAnything) {
            System.out.println("Недостаточно средств!");
        }

    }
}
