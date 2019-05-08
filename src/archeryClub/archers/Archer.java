package archeryClub.archers;

import archeryClub.bows.IBow;

import java.util.Objects;

public abstract class Archer implements Comparable<Archer> {

    protected static final String ARCHER_TYPE_JUNIOR = "junior";
    protected static final String ARCHER_TYPE_SENIOR = "senior";
    protected static final String ARCHER_TYPE_VETERAN = "veteran";

    private String name;
    private String gender;
    private int age;
    protected IBow bow;
    private int experience; //years
    private int competitions;
    protected String type;

    public Archer(String name, String gender, int age, IBow bow, int experience, int competitions) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bow = bow;
        if(validExp(experience)) {
            this.experience = experience;
        }
        this.competitions = competitions;
        this.type = getType();
    }

    protected abstract boolean validExp(int experience);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archer archer = (Archer) o;
        return age == archer.age &&
                experience == archer.experience &&
                competitions == archer.competitions &&
                Objects.equals(name, archer.name) &&
                Objects.equals(gender, archer.gender) &&
                Objects.equals(bow, archer.bow);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender, age, bow, experience, competitions);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Archer o) {
        if(this.name.compareTo(o.name) == 0) {
            return 1;
        }
        return this.name.compareTo(o.name);
    }

    public void incrementCompetition() {
        this.competitions++;
    }

    public int shoot() {
        int totalResult = 0;
        for (int i = 0; i < getMaxArrows(); i++) {
            if(!hasMissed()) {
                totalResult += getScorePoints();
            }
        }
        return totalResult;
    }

    protected abstract int getMaxArrows();
    protected abstract boolean hasMissed();
    protected abstract int getScorePoints();
    public abstract String getType();

}
