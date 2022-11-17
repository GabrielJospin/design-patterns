package behavioral.bridge.classe;

import behavioral.bridge.utils.ClassAbility;
import behavioral.bridge.utils.Point;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Bard extends Classe{

    private int level;
    private final String backstory;

    private final ClassAbility[] classAbilities = {
            new ClassAbility("Canto", primaryAbility.CHARISMA, 2, 0),
            new ClassAbility("Canto dos Jequitibás", primaryAbility.CHARISMA, 4, 5),
            new ClassAbility("Ponto dos Marinheiros", primaryAbility.DEXTERITY, 2, 6),
            new ClassAbility("Ponto dos Baianos", primaryAbility.WISDOM, 10, 10)
    };


    public Bard(int level, String backstory) {
        super(5, 3, new Point[]{
                new Point(0, 0),
                new Point(1, 0),
                new Point(1, 1),
                new Point(0, 0)
        });

        this.level = level;
        this.backstory = backstory;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int upLevel() {
        this.level++;
        return this.level;
    }

    @Override
    public String getBackStory() {
        return this.backstory;
    }


    @Override
    public ClassAbility[] getAllClassAbility() {
        return this.classAbilities;
    }

    @Override
    public ClassAbility getClassAbilityFromId(String id) {
        for (ClassAbility ability : classAbilities) {
            if (Objects.equals(ability.getName(), id))
                return ability;
        }

        throw new NoSuchElementException(String.format("Ability %s not found", id));
    }
}
