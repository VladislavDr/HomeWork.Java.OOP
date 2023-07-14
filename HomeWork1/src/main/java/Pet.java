import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Pet {

    protected String name;
    protected int age;
    protected String coatColor;
    protected String coatLength;
    protected String eyeColor;

    public abstract String voice();

    public abstract String eating(String food);

    public abstract String movement(String direction);

    public abstract String enjoy();

    @Override
    public String toString() {
        return getClass() + ": " +  "Name : " + name +
                ", Age : " + age +
                ", CoatColor : " + coatColor +
                ", CoatLength : " + coatLength +
                ", EyeColor : " + eyeColor;
    }
}
