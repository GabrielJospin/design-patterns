package creational.builder.entities;

import java.util.Random;

public class Director {

    private final CharacterBuilder builder;
    private final Random random = new Random();

    public Director() {
        this.builder = new CharacterBuilder();
    }

    public Character constructVillager(String playerID, String name){
        this.builder.reset();
        char gender = this.random.nextDouble() > 0.5 ? 'M' : 'F';
        this.builder.setRegistrationData(name, playerID, gender);
        this.builder.setCharacterBasics("Human", "villager", this.random.nextDouble(), this.random.nextDouble());
        this.builder.setCharacterAbilities(50, 50, 50, 50, 50, 50);
        return this.builder.getCharacter();
    }

    public Character constructGuardian(String playerID, String name){
        this.builder.reset();
        char gender = this.random.nextDouble() > 0.5 ? 'M' : 'F';
        this.builder.setRegistrationData(name, playerID, gender);
        this.builder.setCharacterBasics("Human", "guardian", 1.0, this.random.nextDouble());
        this.builder.setCharacterAbilities(70, 60, 70, 40, 30, 30);
        return this.builder.getCharacter();
    }

    public Character constructOrcGuardian(String playerID, String name){
        this.builder.reset();
        char gender = this.random.nextDouble() > 0.5 ? 'M' : 'F';
        this.builder.setRegistrationData(name, playerID, gender);
        this.builder.setCharacterBasics("Orc", "guardian", 1.0, this.random.nextDouble());
        this.builder.setCharacterAbilities(80, 70, 80, 20, 20, 30);
        return this.builder.getCharacter();
    }

}
