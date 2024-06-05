import java.util.Random;

public class DiceClass {
    private int numberOfSides;
    private int currentValue;
    private Random random;

    public DiceClass() {
        this.numberOfSides = 6;
        this.random = new Random();
        roll();
    }

    public DiceClass(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
        roll();
    }

    public void roll() {
        this.currentValue = random.nextInt(numberOfSides) + 1;
    }

    public int getValue() {
        return currentValue;
    }
}
