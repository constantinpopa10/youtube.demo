package heinz.newsletter17_SwitchingOnObjectHandles2;

//: Performance.java
import heinz.newsletter17_SwitchingOnObjectHandles2.TransactionType.None;
import heinz.newsletter17_SwitchingOnObjectHandles2.TransactionType.ReadCommitted;
import heinz.newsletter17_SwitchingOnObjectHandles2.TransactionType.ReadUncommitted;
import heinz.newsletter17_SwitchingOnObjectHandles2.TransactionType.RepeatableRead;
public class Performance {
public static void switchOnObject(TransactionType transact) {
  try {
    throw transact;
  } catch(TransactionType.None type) {
  } catch(ReadUncommitted type) {
  } catch(ReadCommitted type) {
  } catch(RepeatableRead type) {
  } catch(TransactionType type) {
  }
}
public static void switchOnInt(TransactionType transact) {
  switch(transact.getId()) {
  case 0: break;
  case 1: break;
  case 2: break;
  case 3: break;
  case 4: break;
  default: break;
  }
}
public static void switchInstanceof(TransactionType transact) {
  if (transact instanceof None) {
  } else if (transact instanceof ReadUncommitted) {
  } else if (transact instanceof ReadCommitted) {
  } else if (transact instanceof RepeatableRead) {
  }
}
public static abstract class TransactionTypeStrategy {
  public abstract void doSomething();
}
public static class RepeatableReadStrategy extends
    TransactionTypeStrategy {
  public void doSomething() {}
}
public static class NonRepeatableReadStrategy extends
TransactionTypeStrategy {
public void doSomething() {}
}
public static void main(String[] args) {
  long time = -System.currentTimeMillis();
  for (int i=0; i<1000000; i++) {
    switchOnObject(RepeatableRead.type);
  }
  time += System.currentTimeMillis();
  System.out.println("Switching 1000000 times on objects " +
    time + "ms");

  time = -System.currentTimeMillis();
  for (int i=0; i<1000000; i++) {
    switchOnInt(RepeatableRead.type);
  }
  time += System.currentTimeMillis();
  System.out.println("Switching 1000000 times on ints " +
    time + "ms");

  time = -System.currentTimeMillis();
  for (int i=0; i<1000000; i++) {
    switchInstanceof(RepeatableRead.type);
  }
  time += System.currentTimeMillis();
  System.out.println("Switching 1000000 times using " +
    "instanceofs " + time + "ms");

  time = -System.currentTimeMillis();
  TransactionTypeStrategy strategy =
    new RepeatableReadStrategy();
  TransactionTypeStrategy strategy2 =
		    new NonRepeatableReadStrategy();
  for (int i=0; i<1000000; i++) {
    strategy.doSomething();
    strategy2.doSomething();
  }
  time += System.currentTimeMillis();
  System.out.println("Switching 1000000 times using " +
    "Strategy Polymorphism pattern " + time + "ms");
}
}
