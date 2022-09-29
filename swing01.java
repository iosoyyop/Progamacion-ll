import javax.swing.*;
import java.awt.Color;

class swing01 {
    public static void main (String args[]){
        JFrame window = new JFrame("Swing");
       MyCanvas canvas = new MyCanvas();

       
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(canvas);
        window.pack();
        window.setSize(400, 300);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}