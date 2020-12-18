package visitorPackage;

public class ConcreteElementA implements Element{

	@Override
	public void Accept(Visitor v) {
		v.VisitElementA(this);
	}
	// implements the element interface
	
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
}
