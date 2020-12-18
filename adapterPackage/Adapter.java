package adapterPackage;

public class Adapter implements Target{
	// THe adapter changes from the Adaptee to the Target, allowing
	// the client to use the adaptee interface
	
	private final Adaptee _adaptee;
	public Adapter(Adaptee adaptee) {
		this._adaptee = adaptee;
	}
	public void getRequest() {
		// When the interface method from the target getRequest()
		// is called, the adaptee's getSpecificRequest() method is
		// called
 		this._adaptee.getSpecificRequest();
 		
	}
	
}
