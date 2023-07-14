import java.util.Iterator;

public class Box {

    private int idBox;
    private int weightBox;
    public Box(int idBox, int weightBox) {
        this.idBox = idBox;
        this.weightBox = weightBox;
    }

    @Override
    public String toString() {
        return "Box: " +
                "idBox=" + idBox +
                " weightBox=" + weightBox;
    }

    public int getIdBox() {
        return idBox;
    }

    public int getWeightBox() {
        return weightBox;
    }

    public void setWeightBox(int weightBox) {
        this.weightBox = weightBox;
    }
}
