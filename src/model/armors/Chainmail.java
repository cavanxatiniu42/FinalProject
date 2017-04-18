package model.armors;

import domainapp.basics.model.meta.DAttr;
import model.armors.Armors;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Chainmail extends Armors {
    @DAttr(name = "bonusStrength", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
    private int bonusStrength;

    public Chainmail(String id, String name, Integer strength, Integer intelligent, Integer dexterity, Integer bonusStrength) {
        super( id, name, strength, intelligent, dexterity);
        this.bonusStrength = bonusStrength;
    }

    public Chainmail(String name, Integer strength, Integer intelligent, Integer dexterity, Integer bonusStrength) {
        super(name, strength, intelligent, dexterity);
        this.bonusStrength = bonusStrength;
    }

    public Chainmail(String name, Integer bonusStrength) {
        super(name);
        this.bonusStrength = bonusStrength;
    }
}
