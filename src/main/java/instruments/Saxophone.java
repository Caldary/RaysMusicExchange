package instruments;

public class Saxophone extends Instruments{
    public Saxophone(String type, String colour) {
        super(type, colour);
    }

    public String playMusic() {
        return "Sexy Sounds";
    }
}
