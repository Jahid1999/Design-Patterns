package DecoratorDesignPattern;

public class Compress extends DecoratorClass {

	public Compress(IFile inner) {
		super(inner);
		
	}

	public IFile readFile() {
		System.out.println("Decompressing  File");
		return this.inner.readFile();
	}

	public void writeFile() {
		this.inner.writeFile();
		System.out.println("Compressing File");
	}

}
