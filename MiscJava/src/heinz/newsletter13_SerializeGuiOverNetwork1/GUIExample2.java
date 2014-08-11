package heinz.newsletter13_SerializeGuiOverNetwork1;

//: GUIExample2
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class GUIExample2 extends JFrame {
public static final int PORT = 4123;
private static final ComponentSerializer compser =
  new ComponentSerializer();
private JPanel personalData;
public GUIExample2() {
  super("Asynchronous Sending GUIExample2 Frame");
  personalData = new JPanel(new GridLayout(0, 2, 5, 5));
  personalData.add(new JLabel("Name: "));
  personalData.add(new JTextField());
  personalData.add(new JLabel("Age: "));
  personalData.add(new JTextField());
  getContentPane().add(personalData, BorderLayout.NORTH);
  getContentPane().add(new JButton(
    new AbstractAction("Serialize Personal Data") {
      public void actionPerformed(ActionEvent e) {
        asyncSerialize(personalData);
      }
    }), BorderLayout.SOUTH);
  setSize(400, 200);
  show();
}
private void asyncSerialize(final Component comp) {
  new Thread() { {start();} // start from initializer block
    public void run() {
      try {
        Socket socket = new Socket("localhost", PORT);
        compser.write(comp, socket.getOutputStream());
        socket.close();
      } catch(IOException ex) {
        ex.printStackTrace();
      }
    }
  };
}
public static void main(String[] args) throws Exception {
  GUIExample2 ex = new GUIExample2();
  ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}