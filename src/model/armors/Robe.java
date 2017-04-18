package model.armors;

import domainapp.basics.model.meta.DAttr;
import model.armors.Armors;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Robe extends Armors {
//    @DAttr(name = "bonusIntelligent", type = DAttr.Type.Integer, mutable = false, min =  1, max = 10)
//    private int bonusIntelligent;
    public Robe(String id, String name, Integer strength, Integer intelligent, Integer dexterity) {
        super(id, name, strength, intelligent, dexterity);
    }

    public Robe(String name, Integer strength, Integer intelligent, Integer dexterity) {
        super(name, strength, intelligent, dexterity);
    }

    public Robe(String name) {
        super(name);
    }


//    public int getBonusIntelligent() {
//        return bonusIntelligent;
//    }
//
//    public void setBonusIntelligent(int bonusIntelligent) {
//        this.bonusIntelligent = bonusIntelligent;
//    }
}
