package decoratorPackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To test the decorator we start with a component
		
		ConcreteComponent comp = new ConcreteComponent(10);
		
		// We can perform the operation 
		comp.operation();
		
		// Alternatively we can add functionality via
		// decorators
		
		Decorator dec = new Decorator(comp);
		dec.wrapperOperation();
		
		// We can even wrap decorators around decorators
		Decorator decdec = new Decorator(dec);
		decdec.wrapperOperation();
	}

}
