package mementoPackage;

public class Originator {
	// the originator either creates a new memento or it uses a memento to
	// restore its original state
	
	private int _state = 0;
	
	public void SetMemento(Memento m) {
		_state = m.getState();
	}
	
	public Memento CreateMemento() {
		return new Memento(_state);
	}
	
	public void setState(int state) {
		_state = state;
	}
	
	public int getState() {
		return _state;
	}
}
