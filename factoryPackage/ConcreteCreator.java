package factoryPackage;

public class ConcreteCreator implements Creator{
	// The concrete Creator is responsible for creating concrete products and overriding the 
	// factory Method if necessary
	
	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}
}
