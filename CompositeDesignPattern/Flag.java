package CompositeDesignPattern;

public class Flag extends CompositeShape{
	
	public void buildShape()
	{
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		System.out.println("\n Flag has been drawn");
		
	}

}
