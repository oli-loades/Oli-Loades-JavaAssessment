package Week1Assesment;

public  class Position {
    private int north;
    private int east;
    private int south;
    private int west;

    public Position(int north, int east,int south, int west){
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Position(){
        this.north = 0;
        this.east = 0;
        this.south = 0;
        this.west = 0;
    }



    public int getNorth() {
        return north;
    }

    public void setNorth(int north) {
        this.north = north;
    }

    public int getEast() {
        return east;
    }

    public void setEast(int east) {
        this.east = east;
    }

    public int getSouth() {
        return south;
    }

    public void setSouth(int south) {
        this.south = south;
    }

    public int getWest() {
        return west;
    }

    public void setWest(int west) {
        this.west = west;
    }

    @Override
    public String toString(){
        return "n:" + getNorth() + " e:" + getEast() + " s:" + getSouth() + " w:" + getWest();
    }


}
