package creational.builder;

public class Character {

    private String name;
    private String playerID;
    private int level;
    private char gender;
    private String race;
    private String classe;
    private Double align_law_chaos;
    private Double align_good_bad;

    // Abilities
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Character() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Double getAlign_law_chaos() {
        return align_law_chaos;
    }

    public void setAlign_law_chaos(Double align_law_chaos) {
        this.align_law_chaos = align_law_chaos;
    }

    public Double getAlign_good_bad() {
        return align_good_bad;
    }

    public void setAlign_good_bad(Double align_good_bad) {
        this.align_good_bad = align_good_bad;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", playerID='" + playerID + '\'' +
                ", level=" + level +
                ", gender=" + gender +
                ", race='" + race + '\'' +
                ", classe='" + classe + '\'' +
                ", align='" + "(" + align_good_bad + "," + align_law_chaos + ")" + '\'' +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", charisma=" + charisma +
                '}';
    }

}
