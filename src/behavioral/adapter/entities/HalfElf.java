package behavioral.adapter.entities;

import behavioral.adapter.interfaces.Character;
import org.json.JSONObject;

import java.util.Random;

public class HalfElf implements Character {

    private final String name;
    private int attack;
    private int defend;
    private int diplomacy;
    private int level;
    private int life;

    public HalfElf(String name, int attack, int defend, int diplomacy) {
        this.name = name;
        this.attack = attack;
        this.defend = defend;
        this.diplomacy = diplomacy;
        this.level = 0;
        this.life = 15;
    }

    @Override
    public void study() {
        this.diplomacy++;
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
    public void attack(Character other) {
        other.defend(this);
    }

    @Override
    public void defend(Character other) {
        Integer attack = (Integer) other.getAttributes().get("attack");
        if(attack > this.defend)
            this.life --;
    }

    @Override
    public boolean diplomacy(Character other) {
        int yourLevel = this.diplomacy / 5;
        int otherLevel = ((Integer) other.getAttributes().get("diplomacy"))/ 5;
        if (yourLevel > otherLevel){
            diplomacy ++;
            return true;
        }
        if (yourLevel < otherLevel){
            diplomacy --;
            return false;
        }
        return true;
    }

    @Override
    public JSONObject getAttributes() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("attack", this.attack);
        jsonObject.put("defend", this.defend);
        jsonObject.put("diplomacy", this.diplomacy);
        jsonObject.put("name", this.name);
        jsonObject.put("level", this.level);
        jsonObject.put("life", this.life);
        return jsonObject;
    }

    @Override
    public String toString() {
        return "HalfElf{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defend=" + defend +
                ", diplomacy=" + diplomacy +
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

    public int getDiplomacy() {
        return diplomacy;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }
}
