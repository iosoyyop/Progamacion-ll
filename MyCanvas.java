import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyCanvas extends JPanel{
    public MyCanvas ()
    {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.GRAY);
    }
    @Override
    protected void paintComponent (Graphics g)
    {
        // Sky
        super.paintComponent(g);
        g.setColor(new Color (127,233,245));
        g.fillRect(0,0, 400, 100);
        // Sun
        g.setColor (Color.YELLOW);
        g.fillOval(40, 40, 20, 20);


        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMountains();
        paintbrush.drawTree();
  
    }

}