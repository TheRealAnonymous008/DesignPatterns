package factoryPackage;

public class Client {

	public static void main(String[] args) {
		// To use the builder, we create a concrete Creator
		
		Creator creator = new ConcreteCreator();
		
		// We call the factory method to create a new product
		Product product = creator.factoryMethod();
		
		product.behavior();

	}

}
