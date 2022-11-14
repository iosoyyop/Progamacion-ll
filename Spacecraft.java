import java.awt.Color;

class Spacecraft{
    private double speed;
    private double angle;
    private double speedUP;
    private Color color;
    private Point point;
    private int live;

    public Spacecraft(Double speed,double angle,double speedUP,Color color,Point point,int live){
        this.speed=speed;
        this.angle=angle;
        speedUP=0.15;
        this.color=color;
        this.point=point;
        this.live=live;

    }

    public void move(){
        speed+=speedUP;
    }
    public void shoot(double angle, double speed){
        Bullet bullet=new Bullet(angle, speed, live, point, color);
    }

    public double getSpeedUP() {
        return speedUP;
    }
    public double getAngle() {
        return angle;
    }
    public int getLive() {
        return live;
    }
    public Color getColor() {
        return color;
    }
    public Point getPoint() {
        return point;
    }
    public double getSpeed() {
        return speed;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public void setLive(int live) {
        this.live = live;
    }
    
}