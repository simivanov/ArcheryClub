package archeryClub;

import archeryClub.archers.Archer;

import java.util.*;

public class Club {

    private String name;
    private String adress;
    private String coach;
    private Collection<Archer> archers;

    public Club(String name, String adress, String coach) {
        setName(name);
        this.adress = adress;
        this.coach = coach;
        this.archers = new HashSet();
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void addArcher(Archer archer) {
        this.archers.add(archer);
    }

    public void startTournament() {
        HashMap<String, HashMap<Archer, Integer>> dnevnik = new HashMap<>();
        printContestants();
        incrementContests();
        shootArrows(dnevnik);
        printStatistics(dnevnik);
    }

    private void shootArrows(HashMap<String, HashMap<Archer, Integer>> dnevnik) {
        for(Archer a : archers) {
            int result = a.shoot();
            if(!dnevnik.containsKey(a.getType())) {
                dnevnik.put(a.getType(), new HashMap<>());
            }
            dnevnik.get(a.getType()).put(a, result);
        }
    }

    private void incrementContests() {
        for (Archer a : archers) {
            a.incrementCompetition();
        }
    }

    private void printContestants() {
        TreeSet<Archer> contestants = new TreeSet<>();
        contestants.addAll(archers);
        for(Archer a : contestants) {
            System.out.println(a);
        }
    }

    private void printStatistics(HashMap<String, HashMap<Archer, Integer>> dnevnik) {
        for(Map.Entry<String, HashMap<Archer, Integer>> e : dnevnik.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
