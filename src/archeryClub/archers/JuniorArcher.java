package archeryClub.archers;

import archeryClub.bows.Bow;
import archeryClub.bows.WoodenBow;

import java.util.Random;

public class JuniorArcher extends Archer {
    public JuniorArcher(String name, String gender, int age, WoodenBow bow, int experience, int competitions) {
        super(name, gender, age, bow, experience, competitions);
    }

    @Override
    protected boolean validExp(int experience) {
        return experience >= 1;
    }

    @Override
    protected int getMaxArrows() {
        return 30;
    }

    @Override
    protected boolean hasMissed() {
        return new Random().nextInt(10) == 1;
    }

    @Override
    protected int getScorePoints() {
        return new Random().nextInt(10) + 1;
    }

    @Override
    public String getType() {
        return ARCHER_TYPE_JUNIOR;
    }


}
