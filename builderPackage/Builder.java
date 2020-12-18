package builderPackage;

public interface Builder {
	// The builder specifies an interface for creating the product
	public void buildProduct();
	
	// The builder also specifies a procedure for returning products it creates
	public Product getResult();
}
