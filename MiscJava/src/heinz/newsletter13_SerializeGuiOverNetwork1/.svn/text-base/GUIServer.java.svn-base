package heinz.newsletter13_SerializeGuiOverNetwork1;

//: GUIServer.java
import java.awt.Component;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class GUIServer {
public static final int PORT = 4123;
private static final ComponentSerializer compser =
  new ComponentSerializer();
@SuppressWarnings("deprecation")
public GUIServer() throws IOException {
  System.out.println("Super-duper GUI SERVER started");
  ServerSocket ss = new ServerSocket(PORT);
  while(true) {
    Socket socket = ss.accept();
    try {
      JFrame frame = new JFrame(
        "Component received from " + socket);
      Component comp = compser.read(socket.getInputStream());
      frame.getContentPane().add(comp);
      frame.pack();
      frame.show();
    } catch(IOException ex) {
      ex.printStackTrace();
    } catch(ClassNotFoundException ex) {
      ex.printStackTrace();
    }
  }
}
public static void main(String[] args) throws IOException {
  new GUIServer();
}
}