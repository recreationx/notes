package Y1S2.SC2002.tut.tut3;

public class Point {
    protected int x;
    protected int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ " + this.x + "," + this.y + "]";
    }
    
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

