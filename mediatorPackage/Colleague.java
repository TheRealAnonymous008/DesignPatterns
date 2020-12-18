package mediatorPackage;

public abstract class Colleague {
	protected Mediator _mediator;
	// optionally, just for colleagues to do something
	protected int state = 0;
	
	// The colleagues are what interact
	public Colleague(Mediator m) {
		_mediator = m;
	}
	
	public abstract void sendRequest();
}
