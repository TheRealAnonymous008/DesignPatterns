package compositePackage;

import java.util.Vector;

public abstract class Component {
	// The component declares the common interface for
	// all objects in the composition
	protected int state;
	public abstract void operation();
	
	// It also maintains a reference to its corresponding component
	protected Vector<Component> children = new Vector<Component>();
	
	// As well as components for adding and removing components
	public abstract void addComponent(Component leaf);
	public abstract void removeComponent(Component leaf);
}
