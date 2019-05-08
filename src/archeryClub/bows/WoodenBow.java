package archeryClub.bows;

public class WoodenBow extends Bow {

    public WoodenBow(String producer, double weight, int pullStrength) {
        super(producer, weight, pullStrength);
    }

    @Override
    protected boolean validPullStrength(int pullStrength) {
        return pullStrength >= 20 && pullStrength <= 30;
    }

    @Override
    public int getBonus() {
        return 0;
    }
}
