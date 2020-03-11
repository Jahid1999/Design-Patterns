package DecoratorDesignPattern;

public class Encryption extends DecoratorClass {

	public Encryption(IFile inner) {
		super(inner);
		
	}

	
	public IFile readFile() {
		System.out.println("Decrypting File");
		return this.inner.readFile();
	}

	public void writeFile() {
		this.inner.writeFile();
		System.out.println("Encrypting File");
		
	}

	
	}

