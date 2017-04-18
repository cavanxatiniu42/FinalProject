package model.weapons;

import domainapp.basics.exceptions.ConstraintViolationException;
import domainapp.basics.model.meta.DAttr;
import domainapp.basics.model.meta.DOpt;
import domainapp.basics.util.Tuple;

public abstract class Weapons {
    @DAttr(name = "id", type = DAttr.Type.String, mutable = false, id = true, auto = true)
    protected String id;
    @DAttr(name = "name", type = DAttr.Type.String, mutable = true, length = 20)
    protected String name;
    @DAttr(name = "strength", type = DAttr.Type.Integer, mutable = false, min = 1, max = 20)
    protected Integer strength;
    @DAttr(name = "dexterity", type = DAttr.Type.Integer, mutable = false, min = 1, max = 20)
    protected Integer dexterity;
    @DAttr(name = "intelligent", type = DAttr.Type.Integer, mutable = false, min = 1, max = 20)
    protected Integer intelligent;
    private static int idCounter;

    @DOpt(type = DOpt.Type.AutoAttributeValueSynchroniser)
    public static void updateAutoGeneratedValue(
            DAttr attrib,
            Tuple derivingValue,
            Object minVal,
            Object maxVal) throws ConstraintViolationException {
        if (minVal != null && maxVal != null) {
            if (attrib.name().equals("id")) {
                int maxIdVal = (Integer) maxVal;
                if (maxIdVal > idCounter)
                    idCounter = maxIdVal;
            }
        }
    }
//    protected static int nextId(int currID) {
//        if (currID == 0) {
//            idCounter++;
//            return idCounter;
//        } else {
//            if (currID > idCounter)
//                idCounter = currID;
//            return currID;
//        }
//    }

    protected static String nextId(String id) {

        idCounter++;
        return id + idCounter;

    }

    public Weapons(String id, String name, Integer strength, Integer dexterity, Integer bonusIntelligent) {
        if (this instanceof Axe) {
            this.id = Axe.class.getSimpleName() + nextId(id);
        } else if (this instanceof Bow) {
            this.id = Bow.class.getSimpleName() + nextId(id);
        } else if (this instanceof Staff) {
            this.id = Staff.class.getSimpleName() + nextId(id);
        }
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligent = bonusIntelligent;
    }

    public Weapons(String name, Integer strength, Integer dexterity, Integer bonusIntelligent) {
        this("", name, 10, 10, 10);
    }

    public Weapons(String name) {
        this("", name, 10, 10, 10);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligent(Integer intelligent) {
        this.intelligent = intelligent;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public int getDexterity() {
        return dexterity;
    }


}
