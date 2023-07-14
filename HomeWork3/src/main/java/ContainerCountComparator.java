import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {

    public int compare(Container o1, Container o2) {
        return o1.getBoxes().size() -  o2.getBoxes().size();
    }
}
