import lombok.Getter;

@Getter
public class GuineaPig extends Pet {
    public GuineaPig(String name, int age, String coatColor, String coatLength, String eyeColor) {
        super(name, age, coatColor, coatLength, eyeColor);
    }

    @Override
    public String voice() {
        return "Grunts and squeaks";
    }

    @Override
    public String eating(String food) {
        return "Crunch crunch " + food;
    }

    @Override
    public String movement(String direction) {
        return "They stomp and knock with their paws to " + direction;
    }

    @Override
    public String enjoy() {
        return "Purring";
    }
}
