package NetworkSocketPractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(1234);
        Socket socket=serverSocket.accept();
        DataInputStream serverin =new DataInputStream(socket.getInputStream());
        DataOutputStream serverout=new DataOutputStream(socket.getOutputStream());
    }
}
