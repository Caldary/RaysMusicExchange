package instruments;

public class Piano extends Instruments{
    public Piano(String type, String colour) {
        super(type, colour);
    }

    public String playMusic() {
        return "Piano Sounds";
    }
}
