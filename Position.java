public class Position {
    public int x;
    public int y;

    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void additionnerPosition(Position p1){
        this.x += p1.getX();
        this.y += p1.getY();
    }
}