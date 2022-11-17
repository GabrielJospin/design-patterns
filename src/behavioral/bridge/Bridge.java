package behavioral.bridge;

import behavioral.bridge.classe.Bard;
import behavioral.bridge.classe.Classe;
import behavioral.bridge.race.Hobbit;
import behavioral.bridge.race.Human;
import behavioral.bridge.race.Race;

public class Bridge {

    public static void main(String[] args) {

        System.out.println("Amora");
        Classe classAmora = new Bard(1, "Singer");
        Race raceAmora = new Human(0, 0,0, 3, 4, 3);
        Character amora = new Character(classAmora, raceAmora, "Amora");
        System.out.println(amora);

        System.out.println("Max");
        Classe classMax = new Bard(2, "Poet");
        Race raceMax = new Hobbit(0, 2, 0, 4, 0, 4);
        Character max = new Character(classMax, raceMax, "Max");
        System.out.println(max);

        System.out.println("Fernando");
        Classe classFernando = new Bard(3, "Guard");
        Race raceFernando = new Human(5, 0 ,5, 0, 0, 0);
        Character fernando = new Character(classFernando, raceFernando, "Fernando");
        System.out.println(fernando);

        System.out.println("Andretti");
        Classe classAndretti = new Bard(5, "Race");
        Race raceAndretti = new Human(3, 3 ,3, 1, 0, 0);
        Character andretti = new Character(classAndretti, raceAndretti, "andretti");
        System.out.println(andretti);

    }
}
