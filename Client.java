import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class Client{
    int port;
    String address;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    public Client(int port,String address){
        this.port=port;
        this.address=address;
    }
    public void initSocket(){
        try {
            socket=new Socket(address,port);
            dos=new DataOutputStream(socket.getOutputStream());
            
            dos.writeUTF("hola :D");
            while(true);
        } catch (UnknownHostException e) {
            System.out.println("error en el servidor");
            e.printStackTrace();
        } catch (IOException e) {
           System.out.println("error de conexion"); 
            e.printStackTrace();
        }
        
    }


    public static void main(String arg[]){
        Client client=new Client(1024,"127.0.0.1");
        client.initSocket();
    }
}