package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int strength;
    private boolean armor;

    public MilitaryUnit(int health, int strength, boolean armor) {
        this.hitPoints = health;
        this.strength = strength;
        this.armor = armor;
    }

    public int doDamage() {
        return this.strength;
    }

    public void sufferDamage(int damage) {
        this.hitPoints -= damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isArmor() {
        return armor;
    }
}
