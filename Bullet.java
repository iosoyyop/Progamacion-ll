import java.awt.Color;

class Bullet{
    double angle;
    double speed;
    int damage;
    Point point;
    Color color;

    public Bullet(double angle,double speed,int damage,Point point,Color color){
        this.angle=angle;
        this.speed=speed;
        damage=10;
        this.point=point;
        this.color=color;
    }

    public double getAngle() {
        return angle;
    }
    public Color getColor() {
        return color;
    }
    public int getDamage() {
        return damage;
    }
    public Point getPoint() {
        return point;
    }
    public double getSpeed() {
        return speed;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

}