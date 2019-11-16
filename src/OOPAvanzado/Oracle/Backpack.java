package OOPAvanzado.Oracle;

public class Backpack implements backpackMethods {

    private double weight;
    private int zippers;

    public Backpack(double weight, int zippers) {
        this.weight = weight;
        this.zippers = zippers;
    }

    @Override
    public boolean backpackIsFilled() {
        if (this.weight == 0) {
            return false;
        }
        return true;
    }

    @Override
    public int zipperQty() {
        return 0;
    }

    public int zippersBroken() {

        return 0;
    }

    @Override
    public String material() {
        return null;
    }

}