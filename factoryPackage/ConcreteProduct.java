package factoryPackage;

public class ConcreteProduct extends factoryPackage.Product{
	// The concrete product extends the Product class, implementing all its methods
	
	public ConcreteProduct() {
		super();
	}
	
	public void behavior() {
		System.out.println(this.state);
	}
}
