package model.weapons;

import domainapp.basics.model.meta.DAttr;
import model.weapons.Weapons;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Bow extends Weapons {
//    @DAttr(name = "dexterity", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
//    private int bonusDexterity;
    public Bow(String id, String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(id, name, strength, dexterity, intelligent);
//        this.bonusDexterity = bonusDexterity;
    }

    public Bow(String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(name, strength, dexterity, intelligent);
//        this.bonusDexterity =bonusDexterity;
    }

    public Bow(String name) {
        super(name);
//        this.bonusDexterity = bonusDexterity;
    }

//    public int getBonusDexterity() {
//        return bonusDexterity;
//    }
//
//    public void setBonusDexterity() {
//        this.bonusDexterity = 2;
//    }
}
