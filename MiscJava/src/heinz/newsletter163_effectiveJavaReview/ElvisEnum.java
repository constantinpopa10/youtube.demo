package heinz.newsletter163_effectiveJavaReview;

import java.util.Arrays;

public enum ElvisEnum implements ElvisType {
	  INSTANCE;	  
	  private String[] favoriteSongs =
	      {"Hound Dog", "Heartbreak Hotel"};
	  public void printFavorites() {
	    System.out.println(Arrays.toString(favoriteSongs));
	  }
	}