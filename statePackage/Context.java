package statePackage;

public class Context {
	// The context defines an interface to be used by the Clinet
	// it maintains its state
	
	private State _state = new StateA();
	
	public void Request() {
		_state.handleRequest();
	}
	
	// Optionally we can change the state
	public void ChangeState(State s) {
		_state = s;
	}
}
