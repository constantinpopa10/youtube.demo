package heinz.newsletter13_SerializeGuiOverNetwork1;

//: GUIExample.java
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class GUIExample extends JFrame {
public static final int PORT = 4123;
private static final ComponentSerializer compser =
  new ComponentSerializer();
private JScrollPane scrollPane;
public GUIExample() {
  super("GUIExample Frame");
  scrollPane = new JScrollPane(new JTable(3,4));
  getContentPane().add(scrollPane);
  getContentPane().add(new JButton(
    new AbstractAction("Serialize Table") {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Now we serialize synchronously");
        try {
          Socket socket = new Socket("localhost", PORT);
          compser.write(scrollPane, socket.getOutputStream());
          socket.close();
        } catch(IOException ex) {
          ex.printStackTrace();
        }
      }
    }), BorderLayout.SOUTH);
  setSize(400, 200);
  show();
}
public static void main(String[] args) throws Exception {
  GUIExample ex = new GUIExample();
  ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}