import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.Timer;
import javax.swing.WindowConstants;


class Board extends JPanel implements ActionListener,KeyListener{
    Snake snake;
    Food food;
    int count=0;
    
    public static void main(String arg[]){
        Board b= new Board();

    }
    public Board(){
        
        setPreferredSize(new Dimension(Config.SIZE_WIN_W,Config.SIZE_WIN_H));
        setBackground(Color.BLACK);
        
        JFrame f=new JFrame("Snake");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(this);
        f.setSize(Config.SIZE_WIN_W, Config.SIZE_WIN_H);
        f.add(this);
        
        f.pack();
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(this);
        Timer t=new Timer(100,this);
        t.start();
        snake =new Snake();
        food=new Food(Config.SIZE_SEG,Color.RED,new Point(5, 6));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(snake.getColor());
        ArrayList<Point> body= new ArrayList<Point>();
        body = snake.getBody();
        int HEAD=0,TAIL=body.size();
        for(int i=1;i<body.size();i++){
            Point p=body.get(i);
            g.setColor(snake.getColor()); 
            g.fillOval(p.getX()*Config.SIZE_SEG,p.getY()*Config.SIZE_SEG,Config.SIZE_SEG,Config.SIZE_SEG);
        }
        Point p=body.get(HEAD);
        g.setColor(snake.getColorHead()); 
        g.fillOval(p.getX()*Config.SIZE_SEG,p.getY()*Config.SIZE_SEG,Config.SIZE_SEG,Config.SIZE_SEG);
        //tail
        p=body.get(TAIL-1);
        g.setColor(snake.getColorTail()); 
        g.fillOval(p.getX()*Config.SIZE_SEG,p.getY()*Config.SIZE_SEG,Config.SIZE_SEG,Config.SIZE_SEG);
       
        food.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Point> body= new ArrayList<Point>();
        body = snake.getBody();
        int HEAD=0;

        for(int i=body.size()-1;i>0;i--){
            int x=body.get(i-1).getX();
            body.get(i).setX(x);
            int y=body.get(i-1).getY();
            body.get(i).setY(y);
        }
        body=snake.getBody();
        int y= body.get(HEAD).getY();
        int x= body.get(HEAD).getX();
        switch(snake.getDir()){
            case 0:
            y--;
            break;
            case 1:
            y++;
            break;
            case 2:
            x--;
            break;
            case 3:
            x++;
            break;
        }
        //efecto tunel
        body.get(HEAD).setY(y);
        body.get(HEAD).setX(x);
        if( body.get(HEAD).getX()*Config.SIZE_SEG > Config.SIZE_WIN_W ){
            body.get(HEAD).setX(0);

        }
        else if( body.get(HEAD).getY()*Config.SIZE_SEG > Config.SIZE_WIN_H ){
            body.get(HEAD).setY(0);

        }
        else if( body.get(HEAD).getX()*Config.SIZE_SEG < HEAD  ){
            body.get(HEAD).setX(Config.SIZE_WIN_W/Config.SIZE_SEG);
        }
        else if( body.get(HEAD).getY()*Config.SIZE_SEG < HEAD ){
            body.get(HEAD).setY(Config.SIZE_WIN_H/Config.SIZE_SEG);
        }
        
        //morderse
        
        for(int i=1;i<body.size();i++){
            if(body.get(HEAD).areTheSame(body.get(i))){
                snake.setLife(snake.getLife()-1);
                System.out.println("vida:");
                System.out.println(snake.getLife());
                if(snake.getLife()<1){
                    System.exit(0);
                }
            }
        }
        
        //new body
        if(  body.get(HEAD).areTheSame(food.getPoint()) == true ){
            body.add(new Point(food.getPoint().getX(),food.getPoint().getY()));
            food.randomNewFood();
            count+=10;
            System.out.println("contador:");
            System.out.println(count);
        }

        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int codeKey = e.getKeyCode();
        switch (codeKey){
            case KeyEvent.VK_UP:
            snake.setDir(snake.UP);
            break;
            case KeyEvent.VK_DOWN:
            snake.setDir(snake.DOWN);
            break;
            case KeyEvent.VK_LEFT:
            snake.setDir(snake.LEFT);
            break;
            case KeyEvent.VK_RIGHT:
            snake.setDir(snake.RIGHT);
            break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
}