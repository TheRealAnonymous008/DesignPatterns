package abstractFactoryPackage;

public class ConcreteFactoryB implements AbstractFactory{
	public AbstractProduct createProduct() {
		return new ConcreteProductB();
	}
}
