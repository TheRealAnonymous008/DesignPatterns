package observerPackage;

public class Observer {
	private int state = 0;
	Subject _subject;
	// The observer is notified via update
	public void update() {
		this.state = _subject.getState();
	}
	
	public int getState() {
		return state;
	}
}
