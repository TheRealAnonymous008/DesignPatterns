package adapterPackage;

public class sampleAdaptee implements Adaptee{
	// To give an example adaptee, we use the following class
	public void getSpecificRequest() {
		System.out.println("Adaptee received request");
	}
}
