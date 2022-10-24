import java.util.ArrayList;
import java.awt.Color;


class Snake{
    private Color color;
    private Color colorHead;
    private Color colorTail;
    private ArrayList<Point>body=new ArrayList<Point>();
    private int speed;
    public final int UP=0;
    public final int DOWN=1;
    public final int LEFT=2;
    public final int RIGHT=3;
    public  int dir;
    public Snake(){

        body.add(new Point(5,2));
        body.add(new Point(4,2));
        body.add(new Point(3, 2));
        color=Color.WHITE;
        colorHead=Color.ORANGE;
        colorTail=Color.BLUE;
        speed=1;
        dir=DOWN;
    }
    public ArrayList<Point> getBody(){
        return body;
    }
    public int getSpeed(){
        return speed;
    }
    public Color getColor(){
        return color;
    }
    public void setDir(int dir) {
        this.dir = dir;
    }
    public int getDir() {
        return dir;
    }
    public Color getColorHead() {
        return colorHead;
    }
    public Color getColorTail() {
        return colorTail;
    }

}