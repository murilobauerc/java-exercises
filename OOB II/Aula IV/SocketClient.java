import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

    private String host;
    private int port;
    Socket socketClient;

    public SocketClient(String host, int port){
        this.host = host;
        this.port = port;
    }

    public void connect() throws UnknownHostException, IOException{
        //System.out.println("Tetando conexão em "+host+":"+port);
        socketClient = new Socket(host,port);
        //System.out.println("Conexão estabelecida");
    }

    public void readResponse() throws IOException{
        String userInput;
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        //System.out.println("Resposta do server:");
        while ((userInput = stdIn.readLine()) != null) {
            System.out.println(userInput);
        }
    }

    private void enviaPapo(Socket client) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        writer.write("PAPO");
        writer.flush();
        writer.close();
    }
    
    public static void main(String arg[]){
        //Criando um objeto client socket 
        SocketClient client = new SocketClient ("localhost",6543);
        try {
            //tenta estabelecer conexão com o server
            client.connect();
            //se obtiver sucesso, le a resposta 
            client.readResponse();
        } catch (UnknownHostException e) {
            System.err.println("Host desconhecido. Não foi possível estabelecer conexão.");
        } catch (IOException e) {
            System.err.println("Não foi possível estabelecer conexão. Server pode estar indisponível."+e.getMessage());
        }
    }
}