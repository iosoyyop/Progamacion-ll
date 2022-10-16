import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle{
    private int w, h;

    public Car(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.fillRect(getDot().getX()+5, getDot().getY()-5, w-10, h-10);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(getDot().getX()+2, getDot().getY()+3, w-5, h-7);
        g.fillRect(getDot().getX()+6, getDot().getY()-3, w-13, h-13);
        g.setColor(Color.WHITE);
        double x1 = w, x2 = w;
        double y = h;
        x1 *= 0.1; x2 *= 0.7;
        y *= 0.8;
        g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y, h/2, h/2);
        g.fillOval(getDot().getX() + (int)x2, getDot().getY() + (int)y, h/2, h/2);
    }
}