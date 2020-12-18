package visitorPackage;

public class Client {
	public static void main(String[] args) {
		ObjectStructure struct = new ObjectStructure();
		// We can use the visitors:
		struct.traverse();
		struct.prettyTraverse();
	}
}
