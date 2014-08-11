package heinz.newsletter22_ClassloadersRevisited.sales;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/** Class that links in another jar */
public class Order {
/** the stock.Warehouse which hosts our items */
private final Warehouse wHouse;
/** how much do we need? */
private final int amount;
/** quantize reservations */
private static int bunch=5;
/** constructs a new order */
public Order(String itemName, int quantity)
   throws java.net.MalformedURLException, NotBoundException,
     RemoteException {
 // look into the rmi registry to locate the warehouse
 wHouse=(Warehouse)Naming.lookup("//localhost/"+itemName);
 this.amount=quantity;
}
/** method that delegates reservation to warehouse */
public void reserve() throws RemoteException {
 for(int count = 0; count < amount; count += bunch)
   wHouse.reserve(bunch);
}
}