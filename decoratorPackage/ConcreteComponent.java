package decoratorPackage;

public class ConcreteComponent implements Component{
	private int _state;
	public ConcreteComponent(int state) {
		// TODO Auto-generated constructor stub
		_state = state;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(_state);
		
	}
	
	
}
