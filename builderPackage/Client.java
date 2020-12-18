package builderPackage;

public class Client {

	public static void main(String[] args) {
		// The client then keeps a copy of a builder and a director whenever it needs a product
		ConcreteBuilder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		
		// When a product is needed, simply call on the director
		director.Construct();
		// And then get the result from the builder
		Product product = builder.getResult();
		
		
		product.behavior();
	}

}
