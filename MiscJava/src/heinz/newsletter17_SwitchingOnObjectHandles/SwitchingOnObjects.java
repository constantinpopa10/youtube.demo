package heinz.newsletter17_SwitchingOnObjectHandles;

//: SwitchingOnObjects.java
import heinz.newsletter17_SwitchingOnObjectHandles.TransactionType.None;
import heinz.newsletter17_SwitchingOnObjectHandles.TransactionType.ReadCommitted;
import heinz.newsletter17_SwitchingOnObjectHandles.TransactionType.ReadUncommitted;
import heinz.newsletter17_SwitchingOnObjectHandles.TransactionType.RepeatableRead;
import heinz.newsletter17_SwitchingOnObjectHandles.TransactionType.Serializable;
public class SwitchingOnObjects {
  public static void switchStatement(TransactionType transact) {
    try {
      throw transact;
    } catch(None type) {
      System.out.println("Case None received");
    } catch(ReadUncommitted type) {
      System.out.println("Case Read Uncommitted");
    } catch(ReadCommitted type) {
      System.out.println("Case Read Committed");
    } catch(RepeatableRead type) {
      System.out.println("Case Repeatable Read");
    } catch(TransactionType type) {
      System.out.println("Default");
    }
  }
  public static void main(String[] args) {
    switchStatement(TransactionType.None.type);
    switchStatement(ReadUncommitted.type);
    switchStatement(ReadCommitted.type);
    switchStatement(RepeatableRead.type);
    switchStatement(Serializable.type);
  }
}