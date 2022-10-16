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
    ArrayList<Ovni> ovnis = new ArrayList<Ovni>();
    ArrayList<Boat> boats = new ArrayList<Boat>();
    ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    Point pSun = new Point(Config.WINDOW_W-300, Config.WINDOW_H-300);
    Point pOvni1 = new Point(Config.OVNI_X, Config.OVNI_Y);
    Point pOvni2 = new Point(Config.OVNI_X2, Config.OVNI_Y2);
    public MyCanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(100,this);
        timer.start();
        boats.add(new Boat(290, 265, -2,0, Color.PINK, 40,20)); //El mar solo se dibuja si hay botes
        ovnis.add(new Ovni(290, 200,-4,-1, Color.BLACK,Config.OVNI_W,Config.OVNI_H));
        ovnis.add(new Ovni(10, 200,4,0, Color.WHITE,Config.OVNI_W,Config.OVNI_H));
        cars.add(new Car(10, 150, 4, 0, Color.RED, 40,20));
        airplanes.add(new Airplane(200, 100, -10, 0, Color.ORANGE, 60, 10));
        
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
        /*paintbrush.drawVehicle(pOvni1,pOvni2);
        paintbrush.drawVehicle();*/
        paintbrush.drawSun(pSun);
        for(Car c : cars){
            c.move();
            c.draw(g);
        }
        for(Ovni c : ovnis){
            c.move();
            c.draw(g);
        }
        for(Boat c : boats){
            c.move();
            c.draw(g);
        
        }
        for(Airplane c : airplanes){
            c.move();
            c.draw(g);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}