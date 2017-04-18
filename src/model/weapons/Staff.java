package model.weapons;

import domainapp.basics.model.meta.DAttr;
import model.weapons.Weapons;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Staff extends Weapons {
//    @DAttr(name = "intelligent", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
//    private int bonusIntelligent;
    public Staff(String id, String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(id, name, strength, dexterity, intelligent);
//        this.bonusIntelligent = bonusIntelligent;
    }

    public Staff(String name, Integer strength, Integer dexterity, Integer intelligent) {
        super(name, strength, dexterity, intelligent);
//        this.bonusIntelligent = bonusIntelligent;
    }

    public Staff(String name) {
        super(name);
//        this.bonusIntelligent = bonusIntelligent;
    }

//    public int getBonusIntelligent() {
//        return bonusIntelligent;
//    }
//
//    public void setBonusIntelligent() {
//        this.bonusIntelligent = 2;
//    }
}
