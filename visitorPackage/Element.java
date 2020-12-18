package visitorPackage;

public interface Element {
	// defines an accept operation for visitors
	
	public void Accept(Visitor v);
}
