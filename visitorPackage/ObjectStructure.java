package visitorPackage;

public class ObjectStructure {
	ConcreteElementA _a = new ConcreteElementA();
	ConcreteElementB _b = new ConcreteElementB();
	
	// an interface for traversing through its elements
	public void traverse() {
		Visitor a = new ConcreteVisitorA();
		_a.Accept(a);
		_b.Accept(a);
	}
	
	public void prettyTraverse() {
		Visitor b = new ConcreteVisitorB();
		_a.Accept(b);
		_b.Accept(b);
	}
}
