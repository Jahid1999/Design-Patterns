package application;

import java.util.ArrayList;

import javafx.scene.layout.Pane;

public  abstract class CompositeShape implements IShape {
	
	ArrayList<IShape> shapes= new ArrayList<>();
	
	public abstract void buildShape();
	
	public void draw(Pane pane) 
	{
		buildShape();
		for(IShape shape: shapes)
		{
			shape.draw(pane);
		}
	}


}
