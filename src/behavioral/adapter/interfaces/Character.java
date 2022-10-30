package behavioral.adapter.interfaces;

import org.json.JSONObject;

public interface Character{

    void study(); // New
    void levelUp();
    void levelsUp(int levels);
    void cure(int cure);
    void attack(Character other); // Change
    void defend(Character other); // Change
    boolean diplomacy(Character other); // New

    JSONObject getAttributes();
}
