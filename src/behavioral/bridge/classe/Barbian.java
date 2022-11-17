package behavioral.bridge.classe;

import behavioral.bridge.utils.ClassAbility;
import behavioral.bridge.utils.Point;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Barbian extends Classe{

    private int level;
    private final String backStory;

    private final ClassAbility[] classAbilities = {
            new ClassAbility("Fúria", primaryAbility.STRENGTH, 2, 0),
            new ClassAbility("Fúria Infernal", primaryAbility.STRENGTH, 4, 5),
            new ClassAbility("Tranca-Rua", primaryAbility.DEXTERITY, 2, 6),
            new ClassAbility("Benção dos Exus", primaryAbility.CONSTITUTION, 10, 10)
    };

    protected Barbian(int level, String backStory) {
        super(1, 5, new Point[]{
                new Point(0, 0),
                new Point(1, 0),
                new Point(1, 1),
                new Point(0, 0)
        });

        this.level = level;
        this.backStory = backStory;
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
        return this.backStory;
    }


    @Override
    public ClassAbility[] getAllClassAbility() {
        return this.classAbilities;
    }

    @Override
    public ClassAbility getClassAbilityFromId(String id) throws NoSuchElementException{
        for (ClassAbility ability : classAbilities) {
            if (Objects.equals(ability.getName(), id))
                return ability;
        }

        throw new NoSuchElementException(String.format("Ability %s not found", id));
    }

}
