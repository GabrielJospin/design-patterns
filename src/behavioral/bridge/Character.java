package behavioral.bridge;

import behavioral.bridge.classe.Classe;
import behavioral.bridge.race.Race;

public class Character {
    private final Classe classe;
    private Race race;
    private final String name;

    public Character(Classe classe, Race race, String name) {
        this.classe = classe;
        this.race = race;
        this.name = name;
    }

    public Classe getClasse() {
        return classe;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Character{" +
                "classe=" + classe +
                ", race=" + race +
                ", name='" + name + '\'' +
                '}';
    }
}
