package instruments;

public class Drums extends Instruments{
    public Drums(String type, String colour) {
        super(type, colour);
    }

    public String playMusic() {
        return "Drum Sounds";
    }
}
