package adapterPackage;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Suppose we wanted to use the adaptee but we only have the target
		sampleAdaptee adaptee = new sampleAdaptee();
		
		// Then to use adaptee, simply make an adapter
		Adapter adapter = new Adapter(adaptee);
		
		// And when we need to call a method defined in target, we just
		// refer to the adapter
		
		// get Request is Target specific.
		adapter.getRequest();
	}

}
