package heinz.newsletter12_FocusModalDialog;

//: LoginDialog2.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginDialog2 extends JDialog {
private final JTextField userName = new JTextField(8);
private final JPasswordField password = new JPasswordField(8);
@SuppressWarnings("deprecation")
public LoginDialog2(Frame owner) {
  super(owner, "Login Dialog", true);
  getContentPane().setLayout(new GridLayout(0,2,5,5));
  getContentPane().add(new JLabel("Username:"));
  getContentPane().add(userName);
  getContentPane().add(new JLabel("Password:"));
  getContentPane().add(password);
  pack();
  Windows.centerOnScreen(this);
  userName.addFocusListener(new FocusListener() {
    public void focusGained(FocusEvent e) {
      userName.transferFocus();
    }
    public void focusLost(FocusEvent e) {
      userName.removeFocusListener(this); // refers to listener
    }
  });
  show();
}
public String getUserName() { return userName.getText(); }
public String getPassword() { return password.getText(); }
public static void main(String[] args) {
  JFrame owner = new JFrame("Login Dialog");
  owner.setLocation(-1000, -1000);
  owner.show();
  owner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  new LoginDialog2(owner);
}
}