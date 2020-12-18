package builderPackage;

public class Director {
	// The director is responsible for constructing and returning finished products
	private Builder _builder;
	
	public Director(Builder builder) {
		this._builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this._builder = builder;
	}
	
	public void Construct() {
		// The construct method makes the products
		_builder.buildProduct();
	}
	
}
