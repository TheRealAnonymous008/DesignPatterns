package templateMethodPackage;

public class Client {
	public static void main(String[] args) {
		// the client calls the concrete class' methods
		AbstractClass sample = new ConcreteClass();
		sample.templateMethod();
	}
}
