package templateMethodPackage;

public class ConcreteClass implements AbstractClass{

	@Override
	public void primitiveMethod1() {
		System.out.println("Hello");
	}

	@Override
	public void primitiveMethod2() {
		System.out.println("Goodbye");
	}
	// The concrete class implements all the abstract class' methods
	
}
