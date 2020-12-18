package compositePackage;

public class Leaf extends Component{
	public int state = 10;
	public void operation() {
		System.out.println("Hello");
	}
	
	
	@Override
	public void addComponent(Component leaf) {
	}
	@Override
	public void removeComponent(Component leaf) {
	}
	
	
	
	// The leaf represents itself in the operation and
	// thus it has no children
}
