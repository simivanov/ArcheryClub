package archeryClub.bows;

public class CarbonBow extends AluminiumBow implements ISeniorBow{

    private int stabilizer;


    public CarbonBow(String producer, double weight, int pullStrength) {
        super(producer, weight, pullStrength);
        this.sight = 2;
        this.stabilizer = 1;
    }

    protected boolean validPullStrength(int pullStrength) {
        return pullStrength >= 28 && pullStrength <= 48;
    }

    @Override
    public int getBonus() {
        return this.sight + this.stabilizer;
    }
}
