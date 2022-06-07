public class Cat
{
//    public static final int LEGS_COUNT = 4;
//    public static final int COUNT_EYES = 2;
//    public static final int MIN_WEIGHT = 1000;
//    public static final int MAX_WEIGHT = 9000;

    private double originalWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;

    private String name;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originalWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }
    public Cat(String name)
    {
        this();
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public Double getWeight()
    {
        return weight;
    }
}
