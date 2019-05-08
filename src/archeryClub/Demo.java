package archeryClub;

import archeryClub.archers.Archer;
import archeryClub.archers.JuniorArcher;
import archeryClub.archers.SeniorArcher;
import archeryClub.archers.VeteranArcher;
import archeryClub.bows.AluminiumBow;
import archeryClub.bows.CarbonBow;
import archeryClub.bows.WoodenBow;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Club club = new Club("Archer BG", "Sofia", "Simo");


        for (int i = 0; i < 40; i++) {

            Archer archer = null;
            int chance = new Random().nextInt(3);
            switch (chance) {
                case 0:
                archer = new JuniorArcher(
                        "Archer" + (i + 1),
                        new Random().nextBoolean() ? "male" : "female",
                        new Random().nextInt(40) + 12,
                        new WoodenBow("producer x", 3, 22),
                        4,
                        2);
                break;

                case 1:
                archer = new SeniorArcher(
                        "Archer" + (i + 1),
                        new Random().nextBoolean() ? "male" : "female",
                        new Random().nextInt(40) + 12,
                        new Random().nextBoolean() ?
                                new AluminiumBow("producer x", 2, 26)
                                :
                                new CarbonBow("producer x", 1.5, 30),
                        4,
                        2);
                break;

                case 2:
                archer = new VeteranArcher(
                        "Archer" + (i + 1),
                        new Random().nextBoolean() ? "male" : "female",
                        new Random().nextInt(40) + 12,
                        new CarbonBow("producer x", 1.5, 30),
                        4,
                        2);
                break;
            }


            club.addArcher(archer);
        }

        club.startTournament();
    }
}
