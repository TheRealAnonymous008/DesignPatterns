package visitorPackage;

public class ConcreteVisitorB implements Visitor{

	@Override
	public void VisitElementA(ConcreteElementA a) {
		System.out.println("The current state is " + a.getState());
	}

	@Override
	public void VisitElementB(ConcreteElementB b) {
		// TODO Auto-generated method stub
		System.out.println("The current value is " + b.getValue());
	}

}
