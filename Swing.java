import javax.swing.*;

class Swing02 {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.WINDOW_W, Config.WINDOW_H);
        window.add(canvas);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}