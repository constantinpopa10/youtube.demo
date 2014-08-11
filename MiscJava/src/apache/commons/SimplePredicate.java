package apache.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
public class SimplePredicate
{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args)
{
  List<String> mixedup = Arrays.asList("A", "0", "B", "C", "1", "D", "F", "3");
  Collection numbersOnlyList = CollectionUtils.predicatedCollection(new ArrayList(),
      new Predicate() {
          public boolean evaluate(Object o) {
              try {
                  Integer.valueOf((String) o);
                  return true;
              } catch (NumberFormatException e) {
                return false;
              }
          }
      });
  for (String s : mixedup) {
      try {
          numbersOnlyList.add(s);
      } catch (IllegalArgumentException e) {
          System.out.println("I love CollectionUtils!");
      }
  }
  System.out.println("\nResults of the predicatedCollection List:");
  CollectionUtils.forAllDo(numbersOnlyList, PrintIt.getInstance() );
}
}