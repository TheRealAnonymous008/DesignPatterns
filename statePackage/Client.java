package statePackage;

public class Client {
	public static void main(String[] args) {
		// The client will use our context.
		
		// To start we insantiate a context
		Context context = new Context();
		
		// its default state is State A
		context.Request();
		
		// however we can also change its state on the fly
		context.ChangeState(new StateB());
		context.Request();
		
		context.ChangeState(new StateA());
		context.Request();
		
		
	}
}
