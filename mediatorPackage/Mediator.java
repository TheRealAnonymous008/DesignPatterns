package mediatorPackage;

public class Mediator {
	// the mediator implements the cooperative
	// behavior by coordinating colleagues
	
	// it knows and maintains its colleagues
	private Colleague a = new ConcreteColleagueA(this, 10);
	private Colleague b = new ConcreteColleagueB(this, 20);
	
	public void handleRequestA() {
		System.out.println(b.state + a.state);
	}
	
	public void handleRequestB() {
		System.out.println(b.state);
	}
}
