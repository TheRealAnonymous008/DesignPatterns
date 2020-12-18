package prototypePackage;

public class ConcreteProductA extends Prototype{
	// The concrete product implements the Prototype's interface, including
	// a clone method
	public Prototype clone() {
		return new ConcreteProductA();
	}
}
