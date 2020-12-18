package chainofresponsibilityPackage;

public interface Handler {
	// the handler defines an interface for handling requests
	
	default Handler getSuccessor() {
		return null;
	}
	
	public void handleRequest();
}
