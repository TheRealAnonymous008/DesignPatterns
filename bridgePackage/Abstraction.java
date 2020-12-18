package bridgePackage;

public abstract class Abstraction {
	// The abstraction defines the implementor's interface
	// and maintains a reference to an implementor
	protected Implementor _imp;
	public Abstraction(Implementor imp) {
		this._imp = imp;
	}
	
	public abstract void operation();
}
