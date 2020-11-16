
public class Cat
{
    private final static int COUNT_OF_EYES = 2;
    private final static double MIN_WEIGHT = 1000.0;
    private final static double MAX_WEIGHT = 9000.0;
    private double originWeight;
    private double weight;
    private Color color;

    private double sumOfEatedFeed;

    public static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(Double startWeight) {
        weight = startWeight;
        originWeight = startWeight;
        count++;
    }

    public Cat(double originWeight, double weight, Color color, double sumOfEatedFeed) {
        this.originWeight = originWeight;
        this.weight = weight;
        this.color = color;
        this.sumOfEatedFeed = sumOfEatedFeed;
    }

    public Cat(Cat other){
        this(other.originWeight, other.weight, other.color, other.sumOfEatedFeed);
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
            sumOfEatedFeed = sumOfEatedFeed + amount;
        }
    }

    public void drink(Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getSumOfFeed() {
        return sumOfEatedFeed;
    }

    public void pee() {
        if (isAlive()) {
            weight = weight - 2;
            System.out.println("Scratch, scratch");
        }
    }

    public static int getCount() {
        return count;
    }

    public boolean isAlive() {
        return weight >= MIN_WEIGHT && weight <= MAX_WEIGHT;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}