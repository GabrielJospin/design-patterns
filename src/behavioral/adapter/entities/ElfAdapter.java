package behavioral.adapter.entities;

import behavioral.adapter.interfaces.Character;
import org.json.JSONObject;

public class ElfAdapter implements Character {

    private final String name;
    private int attack;
    private int defend;
    private int diplomacy;
    private int level;
    private int life;
    private Elf original;

    public ElfAdapter(Elf elf, int diplomacy) {
        this.original = elf;
        this.name = elf.getName();
        this.attack = elf.getAttack();
        this.defend = elf.getDefend();
        this.diplomacy = diplomacy;
        this.level = elf.getLevel();
        this.life = elf.getLife();
    }

    @Override
    public void study() {
        this.diplomacy ++;
    }

    @Override
    public void levelUp() {
        this.original.levelUp();
    }

    @Override
    public void levelsUp(int levels) {
        this.original.levelsUp(levels);
    }

    @Override
    public void cure(int cure) {
        this.original.cure(cure);
    }

    @Override
    public void attack(Character other) {
        other.defend(this);
    }

    @Override
    public void defend(Character other) {
        Integer attack = (Integer) (other.getAttributes().get("attack"));
        this.original.defend(attack);
        this.life = this.original.getLife();
    }

    @Override
    public boolean diplomacy(Character other) {
        int yourLevel = this.diplomacy / 5;
        int otherLevel = ((Integer) other.getAttributes().get("diplomacy")) / 5;
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
        return "ElfAdapter{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defend=" + defend +
                ", diplomacy=" + diplomacy +
                ", level=" + level +
                ", life=" + life +
                ", original=" + original +
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

    public Elf getOriginal() {
        return original;
    }
}
