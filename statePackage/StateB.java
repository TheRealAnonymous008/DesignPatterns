package statePackage;

public class StateB implements State{
	// this is a concrete state class
	
	@Override
	public void handleRequest() {
		System.out.println("State B");
	}
}
