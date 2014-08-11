package misc.dynamicproxies;

class SomeClassImpl implements SomeClass {
	  /** Holds the user name. */
	  private String userName;

	  /**
	   * Creates a new SomeClass object.
	   * 
	   * @param userName
	   *          The user name to use.
	   */
	  public SomeClassImpl(final String userName) {
	    this.userName = userName;
	  }

	  /**
	   * @see java2s.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
	   */
	  public void someMethod() {
	    System.out.println(this.userName);
	  }

	  /**
	   * @see java2s.hcj.proxies.SomeClass#someOtherMethod(java.lang.String)
	   */
	  public void someOtherMethod(final String text) {
	    System.out.println(text);
	  }
	}