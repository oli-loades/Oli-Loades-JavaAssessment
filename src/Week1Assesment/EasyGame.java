package Week1Assesment;


public class EasyGame extends Game {

    public EasyGame() {
        super(new World(new Player(), 10, -5, -10, 5));
    }

    @Override
    public String printIntro() {
        return "Easy Game \n just a baron moor \n you have a magic compass \n try look";
    }

    @Override
    public String look() {
        return "surrounded by more. try a direction";
    }

    @Override
    public String end() {
        return "you find treasure - you win!";
    }
}
