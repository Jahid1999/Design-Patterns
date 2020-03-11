package DecoratorDesignPattern;

public class AddHeader extends DecoratorClass{

	public AddHeader(IFile inner) {
		super(inner);
		
	}

	public IFile readFile() {
		System.out.println("Removing Headder from File");
		return this.inner.readFile();
	}

	public void writeFile() {
		this.inner.writeFile();
		System.out.println("Adding Header in File");
		
	}

}
