package mementoTask;

public class SaveFile {
    private final int level;
    private final String rank;

    public SaveFile(int level, String rank) {
        this.level = level;
        this.rank = rank;
    }

    public int getLevel() {
        return level;
    }

    public String getRank() {
        return rank;
    }
}
