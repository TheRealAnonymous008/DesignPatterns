package mediatorPackage;

public class Client {

	public static void main(String[] args) {
		// When we want to have our two systems interact, we just call our mediator
		
		Mediator m = new Mediator();
		m.handleRequestA();
		m.handleRequestB();
		
	}

}
