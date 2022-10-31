import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Server{
    int port;
    ServerSocket server;
    Socket socket;
    DataInputStream dis;
    BufferedInputStream bis;
    public Server(int port){
        this.port=port;
        powerUp();
    }
    public void powerUp(){
        try {
            server=new ServerSocket(port);
            socket=server.accept();
            bis=new BufferedInputStream(socket.getInputStream());
            dis=new DataInputStream(bis);
            while(true){
                String data=dis.readUTF();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("no se recibio nada");
            e.printStackTrace();
        }
    }
    public static void main(String arg[]){
        new Server(1024);
        
    }
}