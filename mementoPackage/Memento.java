package mementoPackage;

public class Memento {
	// The memento gets the state of the originator.
	
	// for the sake of example, let's assume it's an int
	private int state;
	
	public Memento(int state) {
		this.state = state;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	
}
