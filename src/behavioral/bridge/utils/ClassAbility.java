package behavioral.bridge.utils;

import behavioral.bridge.classe.Classe;

public class ClassAbility {
    final String name;
    final int minimumLevel;
    final Classe.primaryAbility bufferedAbility;
    final int points;

    public ClassAbility(String name, Classe.primaryAbility bufferedAbility, int points, int minimumLevel) {
        this.name = name;
        this.bufferedAbility = bufferedAbility;
        this.points = points;
        this.minimumLevel = minimumLevel;
    }

    public String getName() {
        return name;
    }

    public Classe.primaryAbility getBufferedAbility() {
        return bufferedAbility;
    }

    public int getPoints() {
        return points;
    }

    public int getMinimumLevel() {
        return minimumLevel;
    }
}
