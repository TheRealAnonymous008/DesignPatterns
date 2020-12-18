package commandPackage;

public class ConcreteCommand implements Command{
	// defines a binding system between a receiver and
	// an action
	
	// it maintains a reference to a receiver
	private Receiver _receiver;
	
	// as well as a state
	private int _state;
	
	public ConcreteCommand(Receiver receiver, int state) {
		// The command is given a receiver by the client
		_receiver = receiver;
		_state = state;
	}
	
	public void execute() {
		// Call the receiver to execute the action
		_receiver.action(_state);
	}
}
