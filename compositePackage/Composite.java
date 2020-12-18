package compositePackage;

public class Composite extends Component {
	// Composites define the behavior of components having childern
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for(int i = 0; i < this.children.size(); i++) {
			this.children.elementAt(i).operation();
		}
	}

	@Override
	public void addComponent(Component leaf) {
		this.children.add(leaf);
		
	}

	@Override
	public void removeComponent(Component leaf) {
		this.children.remove(leaf);
	}

}