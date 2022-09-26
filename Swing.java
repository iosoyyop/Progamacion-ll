import javax.swing.*;
import java.awt.Color;

class Swing01{
    public static void main(String args[]){
        JFrame window=new JFrame("io estuve aqui");
        JLabel label01=new JLabel("Wen_ass Java Swing :D");
        JButton button01=new JButton("touch");
        //Color color=new Color(200,100,150);

        window.setBackground(Color.BLUE);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button01.setBounds(50,50,80, 40);
        window.add(button01);
        window.add(label01);
        //label01.setVisible(true);
        window.setSize(400,300);
        window.setVisible(true);
    }
}       