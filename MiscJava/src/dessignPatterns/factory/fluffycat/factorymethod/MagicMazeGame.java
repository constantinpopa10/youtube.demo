package dessignPatterns.factory.fluffycat.factorymethod;

public class MagicMazeGame extends MazeGame {
	  @Override
	  protected Room makeRoom() {
	      return new Room.MagicRoom();
	  }
	}