package heinz.newsletter163_effectiveJavaReview;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Elvis2 implements Serializable, ElvisType {
	  private static final Elvis2 INSTANCE = new Elvis2();
	  private volatile String[] songs =
	      {"Hound Dog", "Heartbreak Hotel"};
	  public static Elvis2 getInstance() { return INSTANCE; }
	  private Elvis2() { }
	  public void leaveTheBuilding() { }
	  public void setFavouriteSongs(String[] songs) {
	    this.songs = songs.clone();
	  }
	  public void printFavorites() {
	    System.out.println(Arrays.toString(songs));
	  }

	  // this should never be invoked
	  private Object readResolve() { 
		  return INSTANCE; 
		  }

	  private void readObject(ObjectInputStream ex)
	      throws IOException {
	    throw new InvalidObjectException("Cannot load another Elvis");
	  }

	  private Object writeReplace() {
	    return new ElvisSerializableForm(songs);
	  }

	  private static class ElvisSerializableForm
	      implements Serializable {
	    private final String[] songs;

	    public ElvisSerializableForm(String[] favoriteSongs) {
	      this.songs = favoriteSongs;
	    }

	    public Object readResolve() {
	      Elvis2.INSTANCE.setFavouriteSongs(songs);
	      return Elvis2.INSTANCE;
	    }
	  }
	}