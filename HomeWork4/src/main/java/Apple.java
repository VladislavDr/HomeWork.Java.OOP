public class Apple extends Fruit{

    private int weight;
    public Apple(int weight) {
        super(weight);
    }
    @Override
    public String toString() {
        return "Apple " +
                "weight " + getWeight();
    }
}
