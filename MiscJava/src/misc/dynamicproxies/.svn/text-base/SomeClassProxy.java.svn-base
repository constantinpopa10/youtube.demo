package misc.dynamicproxies;

class SomeClassProxy implements SomeClass {
	  /** The impl object for this proxy. */
	  private final SomeClassImpl impl;

	  /**
	   * Creates a new SomeClassProxy object.
	   * 
	   * @param impl
	   *          The implementation object for this proxy.
	   */
	  public SomeClassProxy(final SomeClassImpl impl) {
	    this.impl = impl;
	  }

	  /**
	   * @see java2s.hcj.proxies.SomeClass#someMethod()
	   */
	  public void someMethod() {
	    this.impl.someMethod();
	  }

	  /**
	   * @see java2s.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
	   */
	  public void someOtherMethod(String text) {
	    this.impl.someOtherMethod(text);
	  }
	}

