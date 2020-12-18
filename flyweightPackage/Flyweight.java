package flyweightPackage;

public class Flyweight {
	
	// Note that flyweights are immutable objects, thus their
	// internal states cannot be changed once assigned.
	
	private final int _state;
	
	public Flyweight(int extstate) {
		// When initializing, we simply supply flyweight
		// with the extrinsic state.
		_state = extstate;
	}
	
	public void operation() {
		System.out.println(_state);
	}
}
