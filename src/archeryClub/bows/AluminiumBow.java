package archeryClub.bows;

public class AluminiumBow extends Bow implements ISeniorBow {

    protected int sight;

    public AluminiumBow(String producer, double weight, int pullStrength) {
        super(producer, weight, pullStrength);
        this.sight = 1;
    }

    protected boolean validPullStrength(int pullStrength) {
        return pullStrength >= 25 && pullStrength <= 40;
    }

    @Override
    public int getBonus() {
        return this.sight;
    }
}
