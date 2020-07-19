package NetworkSocketPractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",1234);

        DataInputStream clientInput=new DataInputStream(socket.getInputStream());
        DataOutputStream clientOutput =new DataOutputStream(socket.getOutputStream());

        String clientAnswer,serverRequest;
    }
}
