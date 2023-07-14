import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Container implements Comparable<Container>, Iterable<Box> {
   private int id;
   private int weight;

    private final List<Box> boxes;

    public Container(int id, List<Box> boxes) {
        this.id = id;
        this.boxes = boxes;
    }

    public int getWeight() {
        return boxes.stream().mapToInt(Box::getWeightBox).sum();
    }

    public List<Box> getBoxes() {
        return boxes;
    }
    public List<Integer> getBoxesWeight(){
        return boxes.stream().map(Box::getWeightBox).collect(Collectors.toList());
    }
    @Override
    public int compareTo(Container container) {
       return getWeight() - container.getWeight();
    }

    @Override
    public String toString() {
        return "Container: " +
                "id = " + id +
                " weight = " + getWeight() +
                ", number of places = " + boxes.size() + "\n";

    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

}
