package model.armors;

import domainapp.basics.model.meta.DAssoc;
import domainapp.basics.model.meta.DAttr;
import model.armors.Armors;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Leather extends Armors {
//    @DAttr(name = "bonusDexterity", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
//    private int bonusDexterity;
    public Leather(String id, String name, Integer strength, Integer intelligent, Integer dexterity) {
        super(id, name, strength, intelligent, dexterity);
//        this.bonusDexterity = bonusDexterity;
    }

    public Leather(String name, Integer strength, Integer intelligent, Integer dexterity) {
        super(name, strength, intelligent, dexterity);
//        this.bonusDexterity = bonusDexterity;
    }

    public Leather(String name) {
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
