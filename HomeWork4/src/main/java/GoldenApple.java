public class GoldenApple extends Fruit{

    private int weight;
    public GoldenApple(int weight) {
        super(weight);
    }
    @Override
    public String toString() {
        return "GoldenApple " +
                "weight " + getWeight();
    }
}
