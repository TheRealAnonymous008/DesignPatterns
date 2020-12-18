package prototypePackage;

public class Client {

	public static void main(String[] args) {
		// To create a new class, the client simply asks the prototype 
		// to clone itself
		Prototype prototypeA = new ConcreteProductA();
		
		// Now if we need to create another instance, we just clone the
		// prototype
		
		ConcreteProductA newProduct = (ConcreteProductA) prototypeA.clone();
		newProduct.getState();
	}

}
