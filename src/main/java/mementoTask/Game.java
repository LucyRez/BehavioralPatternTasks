package mementoTask;

public class Game {
    private int level;
    private String rank;

    public Game(int level, String rank) {
        this.level = level;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", rank='" + rank + '\'' +
                '}';
    }
}
