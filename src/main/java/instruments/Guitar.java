package instruments;

public class Guitar extends Instruments{

    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public Guitar(String type, String colour, int numberOfStrings) {
        super(type, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public String playMusic() {
        return "Guitar Sounds";
    }
}
