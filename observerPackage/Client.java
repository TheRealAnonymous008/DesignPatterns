package observerPackage;

public class Client {
	public static void main(String[] args) {
		// We instantiate a subject
		Subject subject = new Subject();
		
		// We can then attach some observers to it
		Observer o1 = new Observer();
		Observer o2 = new Observer();
		
		subject.Attach(o1);
		subject.Attach(o2);
		
		subject.setState(10);
		// The observer's states should change
		System.out.println(o1.getState());
		System.out.println(o2.getState());
		
		// We can also detach some observers
		subject.Detach(o1);
		
		subject.setState(20);
		// Only the second observer's value should change
		System.out.println(o1.getState());
		System.out.println(o2.getState());
	
	}
}
