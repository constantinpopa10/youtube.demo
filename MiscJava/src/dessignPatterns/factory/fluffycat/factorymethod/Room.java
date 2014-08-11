package dessignPatterns.factory.fluffycat.factorymethod;

public class Room {
	public void connect (Room room )
	{
		
	}

	static class OrdinaryRoom extends Room
	{

		@Override
		public void connect(Room room) {
			// TODO Auto-generated method stub
			super.connect(room);
		}
		
	}
	
	static class MagicRoom extends Room
	{
		
		@Override
		public void connect(Room room) {
			// TODO Auto-generated method stub
			super.connect(room);
		}
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
