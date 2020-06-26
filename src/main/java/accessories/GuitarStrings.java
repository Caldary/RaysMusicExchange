package accessories;

public class GuitarStrings extends Accessories{
    public GuitarStrings(String type, String description, int acquired) {
        super(type, description, acquired);
    }


    public int markUp() {
        return 0;
    }

    public int willSellFor(int price) {
        return 0;
    }
}
