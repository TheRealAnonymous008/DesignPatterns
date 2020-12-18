package adapterPackage;

public interface Adaptee {
	// The adaptee is what the client wants to use but is incompatible
	// with the Target interface.
	public void getSpecificRequest();
}
