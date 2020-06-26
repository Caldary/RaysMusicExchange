package instruments;

public class Guitar extends Instruments{
    public Guitar(String type, String colour) {
        super(type, colour);
    }

    public String playMusic() {
        return "Guitar Sounds";
    }
}
