package cars;

public interface Vehicle {
	//Does not include the implementation, just the rules
	//Decouples class and its user
	//Separation of concerns
	//Interface is a contract 
	public void accelerate();
	public void brake();
	public void steer();
}
