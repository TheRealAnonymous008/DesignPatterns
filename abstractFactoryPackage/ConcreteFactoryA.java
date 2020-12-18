package abstractFactoryPackage;

public class ConcreteFactoryA implements AbstractFactory {
	// Concrete Factories make the products using methods defined in the Abstract Factory
	public AbstractProduct createProduct() {
		return new ConcreteProductA();
	}
}
