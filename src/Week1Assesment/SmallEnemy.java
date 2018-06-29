package Week1Assesment;

public class SmallEnemy extends Enemy {
    public SmallEnemy(int health, int attack) {
        super(health, attack);
    }

    @Override
    public String talk() {
        return "die1 die! die!";
    }
}
