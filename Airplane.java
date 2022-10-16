import java.awt.Color;
import java.awt.Graphics;

public class Airplane extends Vehicle{
    private int w, h;

    public Airplane(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(),getDot().getY(),w,h);
        g.fillOval(getDot().getX()+20,getDot().getY()-10,w-50,h+25);
        g.fillOval(getDot().getX()+40,getDot().getY()-10,w-50,h+15);
        g.setColor(Color.white);
        g.fillOval(getDot().getX()+2,getDot().getY()+1,w-55,w-55);

    }
}