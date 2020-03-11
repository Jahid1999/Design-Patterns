package DecoratorDesignPattern;

public class GeneralFile implements IFile{
	
	String data= null;
	
	public GeneralFile(String data)
	{
		this.data=data;
	}

	@Override
	public IFile readFile() {
		System.out.println("Reading: " + this.data);
		return null;
	}

	@Override
	public void writeFile() {
		System.out.println("Writting: " + this.data);
		
		
		
	}

}
