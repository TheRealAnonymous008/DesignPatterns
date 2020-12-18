package mediatorPackage;

public class ConcreteColleagueB extends Colleague{

	public ConcreteColleagueB(Mediator m, int state) {
		super(m);
		this.state = state;
	}

	@Override
	public void sendRequest() {
		// Send all requests to the mediator
		_mediator.handleRequestB();
	}

}
