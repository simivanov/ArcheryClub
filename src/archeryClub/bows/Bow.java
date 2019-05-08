package archeryClub.bows;

public abstract class Bow implements IBow{

    private String producer;
    private double weight;
    private int pullStrength;

    public Bow(String producer, double weight, int pullStrength) {
        this.producer = producer;
        this.weight = weight;
        if(validPullStrength(pullStrength)) {
            this.pullStrength = pullStrength;
        }
    }

    protected abstract boolean validPullStrength(int pullStrength);
}
