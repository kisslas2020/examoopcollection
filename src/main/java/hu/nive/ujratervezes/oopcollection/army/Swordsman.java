package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    private boolean shield;

    public Swordsman(boolean shield) {
        super(100, 10, shield);
        this.shield = true;
    }

    @Override
    public int doDamage() {
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        int realDamage = shield == true ? 0 : this.isArmor() == true ? damage / 2 : damage;
        this.shield = false;
        super.sufferDamage(realDamage);
    }
}