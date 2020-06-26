package accessories;

public class DrumSticks extends Accessories{
    public DrumSticks(String type, String description, int acquired) {
        super(type, description, acquired);
    }


    public int markUp() {
        return getAcquired() * 2;
    }

    public int willSellFor(int price) {
        return price * markUp();
    }
}
