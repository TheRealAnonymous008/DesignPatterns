package proxyPackage;

public interface AbstractSubject {
	// provides an interface implemented by both proxy
	// and subject
	public int getState();
	public void setState(int state);
}
