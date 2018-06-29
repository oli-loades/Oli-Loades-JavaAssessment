package Week1Assesment;

public class BigEnemy extends Enemy {
    public BigEnemy(int health, int attack) {
        super(health, attack);
    }

    @Override
    public String talk() {
        return "smash!";
    }

}
