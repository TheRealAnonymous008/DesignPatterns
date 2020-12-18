package abstractFactoryPackage;

public class ConcreteProductA implements AbstractProduct {
	// The concrete products implement the abstractProduct interface, hence they can be returned by the
	// Concrete Factories
	private int state = 10;
	public void behavior() {
		// Implement the product's behavior here
		System.out.println(state);
	}
}
