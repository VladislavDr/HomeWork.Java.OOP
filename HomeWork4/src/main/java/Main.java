import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> box = new Box<>();

        box.addFruit(new Apple(5));
        box.addFruit(new GoldenApple(2));
        box.addFruit(new Apple(6));

        System.out.println("Начальный ящик - " + box);

        System.out.println("Пересыпали из первого ящика во второй все содержимое");
        Box<Fruit> box1 = box.pourToAnotherBox();

        System.out.println("Первый ящик - " + box);
        System.out.println("Второй ящик - " + box1);


    }
}
