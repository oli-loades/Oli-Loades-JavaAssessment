package Week1Assesment;

import java.util.Scanner;

public abstract class Game {

    private World world;

    public Game(World world) {
        this.world = world;
    }

    public abstract String printIntro();//make abstract

    public String goNorth() {
        world.goNorth();
        return "compass reads " + world.getNorthDiff();
    }

    public String goEast() {
        world.goEast();
        return "compass reads " + world.getEastDiff();
    }

    public String goSouth() {
        world.goSouth();
        return "compass reads " + world.getSouthDiff();
    }

    public String goWest() {
        world.goWest();
        return "compass reads " + world.getWestDiff();
    }

    public boolean isEnd() {
        return world.isEnd();
    }

    public World getWorld() {
        return world;
    }

    public abstract String look();

    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println(printIntro());
        while (!isEnd()) {
            char input = in.next().charAt(0);
            switch (input) {
                case 'l':
                    System.out.println(look());
                    break;
                case 'n':
                    System.out.println(goNorth());
                    break;
                case 'e':
                    System.out.println(goEast());
                    break;
                case 's':
                    System.out.println(goSouth());
                    break;
                case 'w':
                    System.out.println(goWest());
                    break;
                default:
                    System.out.println("error - not valid input");
                    break;
            }
        }
        System.out.println(end());
    }

    public abstract String end();


}
