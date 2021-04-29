package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean firstAttack;

    public HeavyCavalry() {
        super(150, 20, true);
        this.firstAttack = true;
    }

    @Override
    public int doDamage() {
        int damage = firstAttack == true ? this.getStrength() * 3 : this.getStrength();
        this.firstAttack = false;
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        super.sufferDamage(damage / 2);
    }
}