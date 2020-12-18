package iteratorPackage;

public class Aggregate {
	// creates a new concrete iterator upon request from the client
	// let's say the aggregate consists of components which
	// need to be iterated over
	private Object[] _components = new Object[10];
	
	public Aggregate() {
		for(int i = 0; i < 10; i++) {
			_components[i] = new Object();
		}
	}
	
	// The create iterator will create an iterator for this
	// object
	public Iterator createIterator() {
		return new Iterator(this);
	}
	
	// Optional: to access private list of components, use
	// a getter
	public Object[] getComponents() {
		return _components;
	}
}
