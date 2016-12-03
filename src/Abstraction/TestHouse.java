package Abstraction;

public abstract class TestHouse {

	public static void main(String[] args) {
		
		Wall wall = new House();
		wall.Height();
		wall.lenght();
		
		Room room = new House();
		room.color();
		room.windows();
		
		House house = new House ();
		house.yard();
				
				

	}

}
