import lombok.Getter;

@Getter
public class Hamster extends Pet {
    public Hamster(String name, int age, String coatColor, String coatLength, String eyeColor) {
        super(name, age, coatColor, coatLength, eyeColor);
    }

    @Override
    public String voice() {
        return "Squeak";
    }

    @Override
    public String eating(String food) {
        return "Crunch crunch " + food;
    }

    @Override
    public String movement(String direction) {
        return "Running and screaming to " + direction;
    }

    @Override
    public String enjoy() {
        return "Teeth clicking";
    }
}
