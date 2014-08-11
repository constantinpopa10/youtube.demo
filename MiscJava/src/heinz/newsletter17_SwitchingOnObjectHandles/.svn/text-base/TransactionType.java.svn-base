package heinz.newsletter17_SwitchingOnObjectHandles;

//: TransactionType.java
public class TransactionType extends Throwable {
private final String name;
private TransactionType(String name) {
this.name = name;
}
public String toString() { return name; }
public static class None extends TransactionType {
public static final TransactionType type = new None();
private None() { super("None"); }
}
public static class ReadUncommitted extends TransactionType {
public static final TransactionType type =
  new ReadUncommitted();
private ReadUncommitted() { super("ReadUncommitted"); }
}
public static class ReadCommitted extends TransactionType {
public static final TransactionType type =
  new ReadCommitted();
private ReadCommitted() { super("ReadCommitted"); }
}
public static class RepeatableRead extends TransactionType {
public static final TransactionType type =
  new RepeatableRead();
private RepeatableRead() { super("RepeatableRead"); }
}
public static class Serializable extends TransactionType {
public static final TransactionType type =
  new Serializable();
private Serializable() { super("Serializable"); }
}
}
