package abstractFactoryPackage;

public class Client {
	
	public static void main(String[] args) {
		// To create concrete products, the client simply keeps a copy of the necessary factories
		AbstractFactory factA= new ConcreteFactoryA();
		AbstractFactory factB= new ConcreteFactoryB();
		
		// here the products can be created
		AbstractProduct productA = factA.createProduct();
		AbstractProduct productB = factB.createProduct();
		
		productA.behavior();
		productB.behavior();
		
		// In the abstract factory, the implementations of the concretefactories are kept hidden and 
		// only knowledge about the interfaces are available
	}
}
