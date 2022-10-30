package behavioral.adapter;

import behavioral.adapter.entities.Elf;
import behavioral.adapter.entities.ElfAdapter;
import behavioral.adapter.entities.HalfElf;
import behavioral.adapter.interfaces.Character;
import behavioral.adapter.interfaces.ClassicCharacter;

public class Adapter {

    public static void main(String[] args) {
        Character momoa = new HalfElf("momoa", 8, 2, 10);
        Elf galadriel = new Elf("galadriel", 3, 7);
        Character galadrielAdapt = new ElfAdapter(galadriel, 15);

        System.out.println(momoa.getAttributes());
        System.out.println(galadrielAdapt.getAttributes());

        galadrielAdapt.attack(momoa);
        momoa.attack(galadrielAdapt);

        System.out.println(momoa.getAttributes());
        System.out.println(galadrielAdapt.getAttributes());

        if (galadrielAdapt.diplomacy(momoa))
            System.out.println("Galadriel Wins");
        else
            System.out.println("Moma Wins");

        System.out.println(momoa.getAttributes());
        System.out.println(galadrielAdapt.getAttributes());

    }
}
