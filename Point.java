public class Point {

    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double calculateTravel(Point p,Point p2,int choise){
        int differenceX= Math.abs(x-p.getX());
        int differenceY= Math.abs(y-p.getY());
        double takeclient= Math.sqrt(Math.pow(differenceX,2)+Math.pow(differenceY,2));
        int SecondDifferenceX= Math.abs(p.getX()- p2.getX());
        int SecondDifferenceY= Math.abs(p.getY()- p2.getY());
        double deliverClient= Math.sqrt(Math.pow(SecondDifferenceX,2)+Math.pow(SecondDifferenceY,2));
        double distanceFinal= takeclient+deliverClient;
        if(choise==2){
            distanceFinal*=0.7;
        }


        return distanceFinal;
        }

}
