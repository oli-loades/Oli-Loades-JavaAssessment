package Week1Assesment;

import java.util.ArrayList;

public class HardGame extends Game {

    ArrayList<Enemy> enemies;

    public HardGame() {
        super(new World(new Player(), -100, 50, 100, -50));
        enemies = new ArrayList<>();
        enemies.add(new SmallEnemy(20, 1));
        enemies.add(new SmallEnemy(20, 1));
        enemies.add(new SmallEnemy(20, 1));
        enemies.add(new BigEnemy(50, 2));
        enemies.add(new BigEnemy(50, 2));
    }

    @Override
    public String printIntro() {
        return "Hard game \n you wake up in the middle of an infinite grey swamp\n you have a magic compass \n good luck";
    }

    @Override
    public String look() {
        return "yuo see nothing but swamp";
    }

    private boolean fight() {
        Player p = getWorld().getPlayer();//current player
        for (Enemy e : enemies) {
            if (!p.isDead()) {
                System.out.println(e.talk());
                p.fight(e);
            }
        }
        return p.isDead();
    }

    @Override
    public String end() {
        String ending;
        System.out.println("its na ambush!!! \ntime to fight your way out!");
        boolean failed = fight();
        if (failed) {
            ending = "you have died";
        } else {
            ending = "you are now the baron of the moore - you win!";
        }
        return ending;
    }

}
