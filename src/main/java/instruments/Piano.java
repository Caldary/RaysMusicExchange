package instruments;


public class Piano extends Instruments{

    private int numberOfKeys;

    public Piano(String type, String colour, int numberOfKeys) {
        super(type, colour);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String playMusic() {
        return "Piano Sounds";
    }

}
