import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private int weightBox;
    private int count;

    private List<T> fruitBox = new ArrayList<>();

    public void addFruit(T fruit){
        fruitBox.add(fruit);
        weightBox += fruit.getWeight();
        count++;
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    public int getWeightBox() {
        if (fruitBox.size() == 0){
            return 0;
        }
        else {
            return weightBox;
        }
    }
    public int getCount(){
        if (fruitBox.size() == 0){
            return 0;
        }
        else {
            return count;
        }
    }

    public void setFruitBox(List<T> box){
        this.getFruitBox().addAll(box);
    }


    public Box<T> pourToAnotherBox() {
        Box<T> newBox = new Box<>();
        newBox.setFruitBox(fruitBox);
        newBox.setWeightBox(weightBox);
        newBox.setCount(count);
        fruitBox.clear();
        return newBox;
    }

    public void setWeightBox(int weightBox) {
        this.weightBox = weightBox;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        if (fruitBox.isEmpty()){
            return "Пустой ящик";
        }
        else {
            return "In box quantity fruits = " + getCount() + ", weight box: " + getWeightBox() +
                    ", in box following fruits: " + getFruitBox();
        }
    }
}
