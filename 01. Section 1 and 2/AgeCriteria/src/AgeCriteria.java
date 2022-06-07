public class AgeCriteria
{
    public static void main(String[] args)
    {
        int vasyaAge = 1;
        int mashaAge = 3;
        int mishaAge = 2;

        int max = -1;
        int middle = -1;
        int min = -1;

        if (vasyaAge <= mashaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (mashaAge > mishaAge) {
                max = mashaAge;
                middle = mishaAge;
            }
            else {
                max = mishaAge;
                middle = mashaAge;
            }
        }

        if (mashaAge <= vasyaAge && mashaAge <= mishaAge) {
            min = mashaAge;
            if (vasyaAge > mishaAge) {
                max = vasyaAge;
                middle = mishaAge;
            }
            else {
                max = mishaAge;
                middle = vasyaAge;
            }
        }
        if (mishaAge <= vasyaAge && mishaAge <= mashaAge) {
            min = mishaAge;
            if (vasyaAge > mashaAge) {
                max = vasyaAge;
                middle = mashaAge;
            }
            else {
                max = mashaAge;
                middle = vasyaAge;
            }
        }
        System.out.println("Minimal age " + min);
        System.out.println("Middle age " + middle);
        System.out.println("Maximum age " + max);

    }
}
