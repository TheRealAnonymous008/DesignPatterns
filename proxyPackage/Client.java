package proxyPackage;

public class Client {

	public static void main(String[] args) {
		// We instantiate a proxy, which implements the
		// abstract subject interface.
		AbstractSubject proxy = new Proxy();
		
		// When we want to access the real subject, we simply
		// call the methods on proxy
		proxy.setState(100);
		System.out.println(proxy.getState());
	}

}
