package visitorPackage;

public class ConcreteElementB implements Element{
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void Accept(Visitor v) {
		v.VisitElementB(this);
	}
}
