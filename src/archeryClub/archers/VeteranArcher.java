package archeryClub.archers;

import archeryClub.bows.Bow;
import archeryClub.bows.CarbonBow;

import java.util.Random;

public class VeteranArcher extends SeniorArcher {
    public VeteranArcher(String name, String gender, int age, CarbonBow bow, int experience, int competitions) {
        super(name, gender, age, bow, experience, competitions);
    }

    @Override
    protected boolean validExp(int experience) {
        return experience >= 10;
    }

    @Override
    protected boolean hasMissed() {
        return false;
    }

    @Override
    public String getType() {
        return ARCHER_TYPE_VETERAN;
    }
}
