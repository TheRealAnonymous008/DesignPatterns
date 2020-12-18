package abstractFactoryPackage;

public interface AbstractFactory {
	// The Abstract Factory is responsible for defining interfaces to be used by the concrete factory
	// in creating an abstract product
	public AbstractProduct createProduct();
}
