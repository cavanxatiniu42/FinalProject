package model.heros;

import model.armors.Armors;
import model.weapons.Weapons;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Warrior extends Hero {

    public Warrior(String id, String name, Integer level, Integer attack, Integer defense, Integer hp,
                   Integer strength, Integer dexterity, Integer intelligent, Weapons weapons, Armors armors) {
        super(id, name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors);
    }

    public Warrior(String name, Integer level, Integer attack, Integer defense, Integer hp,
                   Integer strength, Integer dexterity, Integer intelligent, Weapons weapons, Armors armors) {
        super(name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors);
    }

    public Warrior(String name, Weapons weapons, Armors armors) {
        super(name, weapons, armors);
    }


}
