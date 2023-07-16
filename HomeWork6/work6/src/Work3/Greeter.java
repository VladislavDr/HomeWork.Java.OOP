package Work3;

public class Greeter extends FormatGreet{
    private String formality;

    public String greet(String greet) {
       return this.formality = getGreet(greet);
    }

    public String getFormality() {
        return formality;
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    @Override
    public String toString() {
        return formality;
    }
}
