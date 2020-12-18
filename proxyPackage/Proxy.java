package proxyPackage;

public class Proxy implements AbstractSubject{
	// the proxy maintains a reference to the object it 
	// acts as a surrogate for
	
	AbstractSubject _subject;
	
	public Proxy() {
		_subject = new Subject();
	}
	
	public int getState() {
		return _subject.getState();
	}
	
	public void setState(int state) {
		_subject.setState(state);
	}
}
