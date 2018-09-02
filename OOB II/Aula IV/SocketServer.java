import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    
    private ServerSocket serverSocket;
    private int port;
    
    public SocketServer(int port) {
        this.port = port;
    }
    
    public void start() throws IOException {
        //System.out.println("Incializando o server socket na porta:" + port);
        serverSocket = new ServerSocket(port);      
        //System.out.println("Esperando por clientes...");
        Socket client = serverSocket.accept();
        enviaPepo(client);
    }
    
    private void enviaPepo(Socket client) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        writer.write("PEPO");
        writer.flush();
        writer.close();
    }
    
    
    public static void main(String[] args) {
        int portNumber = 6543;       
        try {
            // inicializando o server socket
            SocketServer socketServer = new SocketServer(portNumber);
            socketServer.start();
            
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}