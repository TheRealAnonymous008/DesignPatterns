package visitorPackage;

public class ConcreteVisitorA implements Visitor{

	// implements the visitor interface
	@Override
	public void VisitElementA(ConcreteElementA a) {
		System.out.println(a.getState());
	}

	@Override
	public void VisitElementB(ConcreteElementB b) {
		// TODO Auto-generated method stub
		System.out.println(b.getValue());
		
	}
}
