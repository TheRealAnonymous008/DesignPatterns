package compositePackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The client initializes components
		Composite composite = new Composite();
		
		composite.addComponent(new Leaf());
		composite.addComponent(new Leaf());
		composite.addComponent(new Leaf());
		
		composite.operation();
		
		// The client treats composite and leaf as the same
		System.out.println("----");
		// to test this we can try it on a single leaf
		Leaf leaf = new Leaf();
		leaf.operation();
	}

}
