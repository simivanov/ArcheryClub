package archeryClub.archers;

import archeryClub.bows.Bow;
import archeryClub.bows.ISeniorBow;

import java.util.Random;

public class SeniorArcher extends Archer {
    public SeniorArcher(String name, String gender, int age, ISeniorBow bow, int experience, int competitions) {
        super(name, gender, age, bow, experience, competitions);
    }

    @Override
    protected boolean validExp(int experience) {
        return experience >= 3;
    }

    @Override
    protected int getMaxArrows() {
        return 60;
    }

    @Override
    protected boolean hasMissed() {
        return new Random().nextInt(20) == 1;
    }

    @Override
    protected int getScorePoints() {
        int point = new Random().nextInt(4) + 6;
        point += bow.getBonus();
        if(point > 10) {
            point = 10;
        }
        return point;
    }

    @Override
    public String getType() {
        return ARCHER_TYPE_SENIOR;
    }
}
