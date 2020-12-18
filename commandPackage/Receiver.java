package commandPackage;

public class Receiver {
	// The receiver knows how to execute the command.
	public void action(int state) {
		System.out.println(state);
	}
}
