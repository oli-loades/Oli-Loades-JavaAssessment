package Week1Assesment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();

        games.add(new EasyGame());
        games.add(new HardGame());

        for (Game game : games) {
            game.play();
        }
    }
}
