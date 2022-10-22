package creational.builder.entities;

public class CharacterBuilder {

    private Character character;

    public CharacterBuilder() {
        this.character = new Character();
    }

    public void reset(){
        this.character = new Character();
    }

    public void setRegistrationData(String name, String playerID, char gender){
        this.character.setName(name);
        this.character.setPlayerID(playerID);
        this.character.setGender(gender);
    }

    public void setCharacterBasics(String race, String classe, Double align_law_chaos, Double align_good_bad){
        this.character.setRace(race);
        this.character.setClasse(classe);
        this.character.setAlign_good_bad(align_good_bad);
        this.character.setAlign_law_chaos(align_law_chaos);
    }

    public void setCharacterAbilities(int strength, int dexterity, int constitution,
                                      int intelligence, int wisdom, int charisma){
        this.character.setStrength(strength);
        this.character.setDexterity(dexterity);
        this.character.setConstitution(constitution);
        this.character.setIntelligence(intelligence);
        this.character.setWisdom(wisdom);
        this.character.setCharisma(charisma);
    }

    public void upLevel(){
        this.character.setLevel(this.character.getLevel() + 1);
    }

    public void upLevel(int level){
        this.character.setLevel(this.character.getLevel() + level);
    }

    public Character getCharacter(){
        return this.character;
    }
}
