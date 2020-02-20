package CompositeDesignPattern;

import java.util.ArrayList;

public  abstract class CompositeShape implements IShape {
	
	ArrayList<IShape> shapes= new ArrayList<>();
	
	public abstract void buildShape();
	
	public void draw() 
	{
		buildShape();
		for(IShape shape: shapes)
		{
			shape.draw();
		}
	}


}
