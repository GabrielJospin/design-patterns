package behavioral.bridge.race;

public class Hobbit extends Race{

    private final int BASIC_STRENGTH = 3;
    private final int BASIC_DEXTERITY = 8;
    private final int BASIC_CONSTITUTION = 3;
    private final int BASIC_INTELLIGENCE = 6;
    private final int BASIC_WISDOM = 5;
    private final int BASIC_CHARISMA = 5;

    public Hobbit(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    @Override
    protected void validatePoints(int strength, int dexterity, int constitution,
                                  int intelligence, int wisdom, int charisma) {
        validateLimit(strength + dexterity + constitution + intelligence + wisdom + charisma, 10);
        validateLimit(strength, BASIC_STRENGTH * 2);
        validateLimit(dexterity, BASIC_DEXTERITY * 2);
        validateLimit(constitution, BASIC_CONSTITUTION * 2);
        validateLimit(intelligence, BASIC_INTELLIGENCE * 2);
        validateLimit(wisdom, BASIC_WISDOM * 2);
        validateLimit(charisma, BASIC_CHARISMA * 2);
    }

    @Override
    void addStrength(int points) {
        validateLimit(points, BASIC_STRENGTH*2);
        super.strength = super.strength + points;
    }

    @Override
    void addDexterity(int points) {
        validateLimit(points, BASIC_DEXTERITY*2);
        super.dexterity = super.dexterity + points;
    }

    @Override
    void addConstitution(int points) {
        validateLimit(points,   BASIC_CONSTITUTION*2);
        super.constitution = super.constitution + points;
    }

    @Override
    void addIntelligence(int points) {
        validateLimit(points, BASIC_INTELLIGENCE*2);
        super.intelligence = super.intelligence + points;
    }

    @Override
    void addWisdom(int points) {
        validateLimit(points, BASIC_WISDOM*2);
        super.wisdom = super.wisdom + points;
    }

    @Override
    void addCharisma(int points) {
        validateLimit(points, BASIC_CHARISMA*2);
        super.charisma = super.charisma + points;
    }

    private void validateLimit(int arg, int limit){
        if(arg > limit)
            throw new IllegalArgumentException("strength of points Must be lower than " + limit);
    }
}
