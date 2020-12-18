package prototypePackage;

public abstract class Prototype {
	// The prototype defines all state variables as well as an interface
	// for cloning this prototype
	protected int state;
	public int getState() {
		return this.state;
	}
	// The clone method allows us to create clones of this prototype
	public abstract Prototype clone();
}
