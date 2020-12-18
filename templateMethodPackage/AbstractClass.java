package templateMethodPackage;

public interface AbstractClass {
	// define a template method to describe the steps of an algorithm
	public default void templateMethod() {
		primitiveMethod1();
		primitiveMethod2();
	}
	// It also defines primitive methods that subclasses can override
	public void primitiveMethod1();
	public void primitiveMethod2();
}
