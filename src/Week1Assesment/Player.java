package Week1Assesment;

public class Player extends Fightable implements Movable {
    Position pos;
    private boolean isDead;

    public Player(Position pos) {//implemented to allow for other games to implemented where start position is customised
        super(100, 5);
        this.pos = pos;
        isDead = false;
    }

    public Player() {
        super(100, 5);
        this.pos = new Position();
        isDead = false;
    }

    //is this actually how directions work, go closer to north means get further from south???
    public void goNorth() {
        pos.setNorth(pos.getNorth() + 5);
        pos.setSouth(pos.getSouth() - 5);
    }

    public void goEast() {
        pos.setEast(pos.getEast() + 5);
        pos.setWest(pos.getWest() - 5);
    }

    public void goSouth() {
        pos.setSouth(pos.getSouth() + 5);
        pos.setNorth(pos.getNorth() - 5);
    }

    public void goWest() {
        pos.setWest(pos.getWest() + 5);
        pos.setEast(pos.getEast() - 5);
    }

    public Position getPosition() {
        return pos;
    }

    @Override
    public String toString() {
        return "Player position = " + pos.toString();
    }


    public void fight(Enemy en) {
        while (getHealth() > 0 && en.getHealth() > 0) {//while both are still alive
            setHealth(getHealth() - en.getAttack());//enemy attacks
            en.setHealth(en.getHealth() - getAttack());//player attacks
        }
        if (getHealth() <= 00) {
            isDead = true;
        }
    }

    public boolean isDead() {
        return isDead;
    }
}
