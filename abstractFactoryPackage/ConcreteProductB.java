package abstractFactoryPackage;

public class ConcreteProductB implements AbstractProduct{
	private float state = 1.10f;
	public void behavior() {
		System.out.println(state);
	}
}
