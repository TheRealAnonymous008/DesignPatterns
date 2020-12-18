package decoratorPackage;

public class Decorator implements Component{
	
	// maintain a reference to a component
	Component _comp;
	
	public Decorator(Component comp) {
		_comp = comp;
	}
	
	public void operation() {
		wrapperOperation();
	}
	
	
	// Create a new wrapper function
	public void wrapperOperation() {
		System.out.println("Wrapped");
		_comp.operation();
		_comp.operation();
		System.out.println("Function");
	}
	
}
