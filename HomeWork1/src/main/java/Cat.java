import lombok.*;

@Getter
@Setter
public class Cat extends Pet {

    public Cat(String name, int age, String coatColor, String coatLength, String eyeColor) {
        super(name, age, coatColor, coatLength, eyeColor);
    }

    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public String eating(String food) {
        return "Crunch crunch " + food;
    }

    @Override
    public String movement(String direction) {
        return "Quietly sneaks to " + direction;
    }

    @Override
    public String enjoy() {
        return "Purrrs purrrs";
    }
}
