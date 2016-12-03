package Abstraction;

public abstract class Room implements Wall{
	public void Height(){
		System.out.println("The height of the walls are 14 ft");
		
		}
	public void lenght() {
		System.out.println("The lenght of the walls are 15 ft");
	}

	
	public abstract void color();
	public abstract void windows();
	
			
	

}
