package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> temp = new ArrayList<>();
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            if (unit.getHitPoints() >= 25) {
                temp.add(unit);
            }
        }
        this.army = temp;
    }

    public int getArmyDamage() {
        int damageTotal = 0;
        for (MilitaryUnit unit : army) {
            damageTotal += unit.doDamage();
        }
        return damageTotal;
    }

    public int getArmySize() {
        return army.size();
    }
}