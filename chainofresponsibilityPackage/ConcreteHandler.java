package chainofresponsibilityPackage;

public class ConcreteHandler implements Handler{
	// the concrete handler implements the Handler's interface
	private Handler _successor;
	
	public ConcreteHandler() {
		// the successor handles the request if this handler
		// cannot.
		_successor = new ConcreteHandlerB();
	}
	
	public void handleRequest() {
		// Pass the request or handle it
		_successor.handleRequest();
	}
	
}
