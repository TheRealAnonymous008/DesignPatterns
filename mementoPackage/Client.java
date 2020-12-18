package mementoPackage;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		
		// The client acts as the Caretaker in this case
		
		
		
		// TODO Auto-generated method stub
		// Let's say we have an originator
		Originator orig = new Originator();
		Vector<Memento> memes = new Vector<>();
		
		
		// Rapidly change the state
		for(int i = 0; i < 10; i ++) {
			orig.setState(i);
			memes.add(orig.CreateMemento());
		}
		
		// Now if we ever need to revert back to an original state we can just 
		// use our memes vector
		
		orig.SetMemento(memes.elementAt(4));
		
		System.out.println(orig.getState());
		
	}

}
