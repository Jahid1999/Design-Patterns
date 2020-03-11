package DecoratorDesignPattern;

public abstract class DecoratorClass implements IFile {
	IFile inner=null;
	public DecoratorClass(IFile inner)
	{
		this.inner=inner;
	}
	
	public abstract IFile readFile();
	public abstract void writeFile();

}
