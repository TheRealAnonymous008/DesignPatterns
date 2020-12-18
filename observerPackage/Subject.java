package observerPackage;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

public class Subject {
	// the subject knows all its observers
	private AbstractSet<Observer> observers = new HashSet<>();
	
	private int state = 0;
	
	public void setState(int state) {
		this.state = state;
		
		// When the state of the subject changes it will notify all of its observers
		Iterator<Observer> iter = observers.iterator();
		
		while(iter.hasNext()) {
			iter.next().update();
		}
	}
	
	public int getState() {
		return state;
	}
	
	// We can also add or detach observers as needed
	public void Attach(Observer o) {
		observers.add(o);
		o._subject = this;
	}
	
	public void Detach(Observer o) {
		observers.remove(o);
		o._subject = null;
	}
}
