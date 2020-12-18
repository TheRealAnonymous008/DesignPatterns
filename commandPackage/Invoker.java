package commandPackage;

public class Invoker {
	// The invoker calls the command
	public void invoke(Command command) {
		command.execute();
	}
}
