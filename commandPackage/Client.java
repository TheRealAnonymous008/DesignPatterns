package commandPackage;

public class Client {

	public static void main(String[] args) {
		// A receiver and concrete command are set by the client
		Receiver receiver = new Receiver();
		// state is optional
		Command command = new ConcreteCommand(receiver, 10);
		
		// The invoker (can be from another class entirely)
		// calls the command
		
		Invoker invoker = new Invoker();
		invoker.invoke(command);
		
		
	}

}
