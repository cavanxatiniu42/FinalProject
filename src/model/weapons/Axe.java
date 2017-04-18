package model.weapons;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Axe extends Weapons {
//    @DAttr(name = "strength", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
//    private int bonusStrength;
    public Axe(String  id, String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(id, name, strength, dexterity, intelligent);
//        this.bonusStrength = bonusStrength;
    }

    public Axe(String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(name, strength, dexterity, intelligent);
//        this.bonusStrength = bonusStrength;
    }

    public Axe(String name) {
        super(name);
//        this.bonusStrength = bonusStrength;
    }

//    public int getBonusStrength() {
//        return bonusStrength;
//    }
//
//    public void setBonusStrength() {
//        this.bonusStrength = 2;
//    }
}
