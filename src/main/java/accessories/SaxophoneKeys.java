package accessories;

public class SaxophoneKeys extends Accessories{
    public SaxophoneKeys(String type, String description, int acquired) {
        super(type, description, acquired);
    }

    public int markUp() {
        return 0;
    }

    public int willSellFor(int price) {
        return 0;
    }


}
