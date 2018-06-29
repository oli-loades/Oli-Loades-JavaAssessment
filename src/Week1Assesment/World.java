package Week1Assesment;

public class World implements Movable {
    Player player;
    Position end;

    public World(Player player, int north, int east, int south, int west) {
        this.player = player;
        end = new Position(north, east, south, west);
    }

    public World(Player player) {
        this.player = player;
        end = new Position();
    }

    @Override
    public void goNorth() {
        player.goNorth();
    }

    @Override
    public void goEast() {
        player.goEast();
    }

    @Override
    public void goSouth() {
        player.goSouth();
    }

    @Override
    public void goWest() {
        player.goWest();
    }

    public boolean isEnd() {//is at he end position
        boolean isEnd = false;
        Position pos = player.getPosition();
        if (pos.getNorth() == end.getNorth() && pos.getEast() == end.getEast()) {//split into two ifs as 4 seemed too long
            if (pos.getSouth() == end.getSouth() && pos.getWest() == end.getWest()) {
                isEnd = true;
            }
        }
        return isEnd;
    }

    public Player getPlayer() {
        return player;
    }

    public int getNorthDiff() {
        return +end.getNorth() - player.getPosition().getNorth();
    }

    public int getEastDiff() {
        return +end.getEast() - player.getPosition().getEast();
    }

    public int getSouthDiff() {
        return +end.getSouth() - player.getPosition().getSouth();
    }

    public int getWestDiff() {
        return +end.getWest() - player.getPosition().getWest();
    }

}
