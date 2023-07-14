import org.w3c.dom.css.Counter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(1, 3);
        Box box2 = new Box(2, 5);
        List<Box> boxList1 = new ArrayList<>();
        boxList1.add(box1);
        boxList1.add(box2);

        Box box3 = new Box(3, 1);
        Box box4 = new Box(4, 2);
        Box box5 = new Box(5, 3);
        Box box6 = new Box(6, 4);
        List<Box> boxList2 = List.of(box3, box4, box5, box6);

        Box box7 = new Box(7, 50);
        List<Box> boxList3 = List.of(box7);

        Box box8 = new Box(8, 1);
        Box box9 = new Box(9, 10);
        Box box10 = new Box(10,15);
        List<Box> boxList4 = List.of(box8, box9, box10);

        Container c1 = new Container(1, boxList1);
        Container c2 = new Container(2, boxList2);
        Container c3 = new Container(3, boxList3);
        Container c4 = new Container(4, boxList4);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        List<Container> containersGroup = new ArrayList<>();

        containersGroup.add(c1);
        containersGroup.add(c2);
        containersGroup.add(c3);
        containersGroup.add(c4);

        var containers = containersGroup;

        containers.sort((o1, o2) -> {
            int place1 = o1.getWeight();
            int place2 = o2.getWeight();
            return o1.compareTo(o2);
        });

        System.out.println(containers);

        Comparator countPlace = new ContainerCountComparator();
        Collections.sort(containers, countPlace);
        System.out.println(containers);

        containers.stream().flatMap(container -> container.getBoxes().stream()).forEach(System.out::println);


//        containers.stream().flatMap(container -> container.getBoxesWeight().stream().filter(x -> x > 5)).forEach(System.out::println);
    }
}

