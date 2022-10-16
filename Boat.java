import java.awt.Color;
import java.awt.Graphics;

public class Boat extends Vehicle{
    private int w, h;

    public Boat(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,280, 400,200);
        g.setColor(Color.BLACK);
        g.fillRect(getDot().getX()+15, getDot().getY()-15, w-35, h+11);
        g.setColor(Color.WHITE);
        g.fillRect(getDot().getX()+10, getDot().getY()-5, w-20, h-15);
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        

    }
}