package heinz.newsletter163_effectiveJavaReview;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable, ElvisType{	
	private static final long serialVersionUID = 1L;
	private static final Elvis INSTANCE = new Elvis();
	  private volatile String[] songs =
	      {"Hound Dog", "Heartbreak Hotel"};
	  public static Elvis getInstance() { return INSTANCE; }
	  private Elvis() { }
	  public void leaveTheBuilding() { }
	  public void printFavorites() {
	    System.out.println(Arrays.toString(songs));
	  }
	  public void setFavouriteSongs(String[] songs) {
	    this.songs = songs.clone();
	  }
	}

