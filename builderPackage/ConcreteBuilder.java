package builderPackage;

public class ConcreteBuilder implements Builder{
	// The concrete builder implements the buildProduct method, which contains the procedures for constructing
	// the product
	
	@SuppressWarnings("unused")
	private Product _product;
	
	public void buildProduct() {
		// More complicated procedures can be inserted here
		this._product = new Product();
	}
	
	public Product getResult() {
		return this._product;
	}
	
}
