package bridgePackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We initialize by making a concrete implementor
		ConcreteImplementor imp = new ConcreteImplementor();
		
		// We also want a new abstraction 
		RefinedAbstraction ref = new RefinedAbstraction(imp);
		
		// Now when we wish to call concrete implementor's 
		// methods, we simply use the abstraction
		ref.operation();
	}

}
