package misc.dynamicproxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * An invocation handler that counts the number of calls for all methods in the
 * target class.
 * 
 * @author <a href=mailto:kraythe@arcor.de>Robert Simmons jr. (kraythe)</a>
 * @version $Revision: 1.2 $
 * 
 * @see java.lang.reflect.InvocationHandler
 */
class MethodCountingHandler implements InvocationHandler {
  /** The implementation object for this proxy. */
  private final Object impl;

  /** Holds the invocation count. */
  private int invocationCount = 0;

  /**
   * Creates a new MethodCOuntingHandler object.
   * 
   * @param impl
   */
  public MethodCountingHandler(final Object impl) {
    this.impl = impl;
  }

  /**
   * Gets the value of the property invocationCount.
   * 
   * @return The current value of invocationCount
   */
  public int getInvocationCount() {
    return invocationCount;
  }

  /**
   * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
   *      java.lang.reflect.Method, java.lang.Object[])
   */
  public Object invoke(Object proxy, Method meth, Object[] args) throws Throwable {
    try {
      this.invocationCount++;
      Object result = meth.invoke(impl, args);
      return result;
    } catch (final InvocationTargetException ex) {
      throw ex.getTargetException();
    }
  }
}