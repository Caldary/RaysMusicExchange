package instruments;

public class Saxophone extends Instruments{

    private int numberOfValves;
    public Saxophone(String type, String colour, int numberOfValves) {
        super(type, colour);
        this.numberOfValves = numberOfValves;
    }

    public String playMusic() {
        return "Sexy Sounds";
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }
}
