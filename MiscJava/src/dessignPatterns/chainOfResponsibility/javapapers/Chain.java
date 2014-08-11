package dessignPatterns.chainOfResponsibility.javapapers;
 
/** 
 * <a href=http://javapapers.com/design-patterns/chain-of-responsibility-design-pattern/> 
 */
public interface Chain {
  public abstract void setNext(Chain nextInChain);
  public abstract void process(Number request);
}