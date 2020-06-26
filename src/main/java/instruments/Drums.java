package instruments;

public class Drums extends Instruments{

    private int numberOfPedals;

    public Drums(String type, String colour, int numberOfPedals) {
        super(type, colour);
        this.numberOfPedals = numberOfPedals;
    }

    public String playMusic() {
        return "Drum Sounds";
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
