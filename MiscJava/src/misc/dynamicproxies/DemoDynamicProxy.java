package misc.dynamicproxies;

/*
*
* This software is granted under the terms of the Common Public License,
* CPL, which may be found at the following URL:
* http://www-124.ibm.com/developerworks/oss/CPLv1.0.htm
*
* Copyright(c) 2003-2005 by the authors indicated in the @author tags.
* All Rights are Reserved by the various authors.
*
########## DO NOT EDIT ABOVE THIS LINE ########## */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
* Demonstrates a dynamic proxy.
* 
* @author <a href=mailto:kraythe@arcor.de>Robert Simmons jr. (kraythe)</a>
* @version $Revision: 1.2 $
*/
public class DemoDynamicProxy {
 /**
  * Run the demonstration.
  * 
  * @param args
  *          Command Line Arguments (ignored).
  */
 public static final void main(final String[] args) {
   SomeClass proxy = SomeClassFactory.getDynamicSomeClassProxy();
   proxy.someMethod();
   proxy.someOtherMethod("Our Proxy works!");

   InvocationHandler handler = Proxy.getInvocationHandler(proxy);
   if (handler instanceof MethodCountingHandler) {
     System.out.println(((MethodCountingHandler) handler).getInvocationCount());
   }
 }
}
