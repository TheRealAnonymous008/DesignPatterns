package chainofresponsibilityPackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We can make requests to the concrete handler
		ConcreteHandler handler = new ConcreteHandler();
		
		handler.handleRequest();
		
	}

}
