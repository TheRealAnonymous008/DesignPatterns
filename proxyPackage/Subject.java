package proxyPackage;

public class Subject implements AbstractSubject {
	// defines the real object the proxy represents
	private int _state;
	
	public void setState(int state) {
		_state = state;
	}
	
	public int getState() {
		return _state;
	}
}
