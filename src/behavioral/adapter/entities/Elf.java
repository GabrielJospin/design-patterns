package behavioral.adapter.entities;

import behavioral.adapter.interfaces.ClassicCharacter;

import java.util.Random;

public class Elf implements ClassicCharacter {

    private final String name;
    private int attack;
    private int defend;
    private int level;
    private int life;

    public Elf(String name, int attack, int defend) {
        this.name = name;
        this.attack = attack;
        this.defend = defend;
        this.level = 0;
        this.life = 15;
    }


    @Override
    public void levelUp() {
        this.level++;
        Random random = new Random();
        if(random.nextDouble() > 0.5)
            this.attack ++;
        else
            this.defend ++;
    }

    @Override
    public void levelsUp(int levels) {
        for(int i = 0; i < levels; i++)
            levelUp();
    }

    @Override
    public void cure(int cure) {
        this.life ++;
    }

    @Override
    public int attack() {
        return this.attack;
    }

    @Override
    public void defend(int attack) {
        if (attack > this.defend)
            life --;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defend=" + defend +
                ", level=" + level +
                ", life=" + life +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefend() {
        return defend;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }
}
