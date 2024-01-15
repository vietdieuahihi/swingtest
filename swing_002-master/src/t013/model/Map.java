package t013.model;

import java.util.List;

public class Map {
    private int level;
    private List<String> lines;

    public Map(int level, List<String> lines) {
        this.level = level;
        this.lines = lines;
    }

    public Map() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }
}
