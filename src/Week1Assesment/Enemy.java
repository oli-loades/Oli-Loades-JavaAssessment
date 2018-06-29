package Week1Assesment;

public abstract class Enemy extends Fightable {
    public Enemy(int health, int attack) {
        super(health, attack);
    }

    public abstract String talk();

}

