package Week1Assesment;

public abstract class Fightable {
    private int health;
    private int attack;

    public Fightable(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public int getAttack() {
        return attack;
    }

    ;
}
