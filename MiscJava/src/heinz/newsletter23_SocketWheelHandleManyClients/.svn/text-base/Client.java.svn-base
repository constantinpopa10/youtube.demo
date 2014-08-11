package heinz.newsletter23_SocketWheelHandleManyClients;

//Client.java
import java.net.*;
import java.io.*;
public class Client {
public Client(int port) throws Exception {
 Socket socket = new Socket("localhost", port);
 ObjectOutputStream out = new ObjectOutputStream(
   socket.getOutputStream());
 ObjectInputStream in = new ObjectInputStream(
   socket.getInputStream());
 for (int i=0; i<10; i++) {
   out.writeObject(new Integer(i));
   out.flush();
   out.reset();
   System.out.println(in.readObject());
   Thread.sleep(1000);
 }
}
public static void main(String[] args) throws Exception {
 new Client(Server.PORT);
}
}