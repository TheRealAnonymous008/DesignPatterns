package statePackage;

public class StateA implements State{
	@Override
	public void handleRequest() {
		System.out.println("State A");
	}
}
