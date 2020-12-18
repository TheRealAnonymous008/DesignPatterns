package facadePackage;

public class Facade {
	// The facade contains each component in the subsystem
	// and has knowledge of how to handle client requests
	
	private ComponentA _compa;
	private ComponentB _compb;
	private ComponentC _compc;
	
	public Facade() {
		_compa = new ComponentA();
		_compb = new ComponentB();
		_compc = new ComponentC();
	}
	
	public void performOperation() {
		_compa.operation();
	}
	
	public void receiveRequest() {
		_compb.request();
	}
	
	public void specialOperation() {
		_compb.request();
		_compc.behavior();
	}
}
