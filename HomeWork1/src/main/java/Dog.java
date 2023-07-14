import lombok.Getter;

@Getter
public class Dog extends Pet {
    public Dog(String name, int age, String coatColor, String coatLength, String eyeColor) {
        super(name, age, coatColor, coatLength, eyeColor);
    }

    @Override
    public String voice() {
        return "Woof woof";
    }

    @Override
    public String eating(String food) {
        return "Crunch crunch " + food;
    }

    @Override
    public String movement(String direction) {
        return "Joyfully running to " + direction;
    }

    @Override
    public String enjoy() {
        return "Wildly wagging his tail";
    }
}
