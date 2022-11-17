package behavioral.bridge.race;

public abstract class Race {

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;


    public Race(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        validatePoints(strength, dexterity, constitution, intelligence, wisdom, charisma);
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    protected abstract void validatePoints(int strength, int dexterity, int constitution,
                                           int intelligence, int wisdom, int charisma);

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    abstract void addStrength(int points);

    abstract void addDexterity(int points);

    abstract void addConstitution(int points);

    abstract void addIntelligence(int points);

    abstract void addWisdom(int points);

    abstract void addCharisma(int points);

    @Override
    public String toString() {
        return "Race{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }
}
