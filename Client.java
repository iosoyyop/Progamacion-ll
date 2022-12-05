import java.awt.event.ActionListener;
import javax.swing.Timer;

class Client{
    
    public static void main(String args[]){
        int money=2000;
        Creditcard client1cc=new Creditcard(8045,8000,2023,01,"1234 5678 1478 2580",03,2003);
        Debitcard  client1dc=new Debitcard(4556,2000,money,2023,01,"4321 8765 8741 0852",03,2003);
        client1cc.activeCard(03,2003);
        client1dc.activeCard(03,2003);
        client1cc.buySomething(8045, 9000,01,2023);
        client1dc.deposit(1000);
        client1dc.buySomething(4556,1000,01,2023);
        //another client 
        System.out.println(" ");
        System.out.println("el otro cliente :D");
        System.out.println(" ");
        Creditcard client2cc=new Creditcard(8045,8000,2023,01,"1234 5678 1478 2580",03,2003);
        Debitcard  client2dc=new Debitcard(4556,2000,money,2023,01,"4321 8765 8741 0852",03,2003);
        client2cc.buySomething(8045, 9000,01,2023);
        client2cc.activeCard(03,2003);
        Timer timer = new Timer (300, new ActionListener (){
            public void actionPerformed(ActionEvent e)
            {
        // Aquí el código que queramos ejecutar.
            }
        });
        timer.start();
    }
}