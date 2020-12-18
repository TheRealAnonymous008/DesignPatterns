package mediatorPackage;

public class ConcreteColleagueA extends Colleague{

	public ConcreteColleagueA(Mediator m, int state) {
		super(m);
		this.state = state;
	}

	@Override
	public void sendRequest() {
		// Send all requests to mediator
		_mediator.handleRequestA();
	}
	
	
}
