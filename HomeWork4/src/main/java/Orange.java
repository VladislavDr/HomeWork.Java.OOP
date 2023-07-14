public class Orange extends Fruit{
    private int weight;
    public Orange(int weight) {
        super(weight);
    }
    @Override
    public String toString() {
        return "Orange " +
                "weight " + getWeight();
    }
}
