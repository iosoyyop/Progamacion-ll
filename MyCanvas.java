import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JPanel;

public class MyCanvas extends JPanel implements ActionListener{
    ArrayList<Car> cars = new ArrayList<Car>();
    Point pSun = new Point(Config.WINDOW_W-300, Config.WINDOW_H-300);
    Point pOvni1 = new Point(Config.OVNI_X, Config.OVNI_Y);
    Point pOvni2 = new Point(Config.OVNI_X2, Config.OVNI_Y2);
    public MyCanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(100,this);
        timer.start();
        cars.add(new Car(10, 250, 2, 0, Color.PINK, 60,30));
        cars.add(new Car(10, 200, 3, 0, Color.YELLOW, 50, 25));
        cars.add(new Car(10, 150, 4, 0, Color.RED, 40,20));
        cars.add(new Car(10, 100, 5, 0, Color.ORANGE, 30, 15) );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMontains();
        paintbrush.drawMontains(0, 100);
        paintbrush.drawMontains(140, 110);
        paintbrush.drawMontains(110, 110);
        paintbrush.drawTree();
        paintbrush.drawTree(50, 100);
        paintbrush.drawTree(130, 120);
        paintbrush.drawTree(340, 80);
        paintbrush.drawTree(260, 115);
        paintbrush.drawTree(200, 150);
        paintbrush.drawVehicle(pOvni1,pOvni2);
        paintbrush.drawVehicle();
        paintbrush.drawSun(pSun);
        for(Car c : cars){
            c.move();
            c.draw(g);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}