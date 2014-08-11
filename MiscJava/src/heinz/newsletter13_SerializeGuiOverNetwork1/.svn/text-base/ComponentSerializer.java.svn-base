package heinz.newsletter13_SerializeGuiOverNetwork1;

//: ComponentSerializer.java
import java.io.*;
import java.awt.*;
public class ComponentSerializer {
public void write(Component comp, OutputStream out)
    throws IOException {
  System.out.println("writing " + comp);
  ObjectOutputStream oout = new ObjectOutputStream(out);
  oout.writeObject(new ComponentEncapsulator(comp));
  oout.reset();
  oout.flush();
}
public Component read(InputStream in)
    throws IOException, ClassNotFoundException {
  System.out.println("reading component");
  ObjectInputStream oin = new ObjectInputStream(in);
  ComponentEncapsulator enc =
    (ComponentEncapsulator)oin.readObject();
  return enc.getComponent();
}
}