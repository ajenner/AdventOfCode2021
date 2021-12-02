package Submarine;


public class Submarine {

    private int depth;
    private int horizontalPos;
    private int aim;

    public Submarine() {
        this.depth = 0;
        this.horizontalPos = 0;
    }

    public void moveSubDepth(int y) {
        this.depth += y;
    }

    public void moveSubHorizontal(int x) {
        this.horizontalPos += x;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getHorizontalPos() {
        return this.horizontalPos;
    }
    
    public void moveSubWithAim(int x) {
        this.horizontalPos += x;
        this.depth += x * aim;
    }

    public void calibrateAim(int x) {
        this.aim += x;
    }
}
