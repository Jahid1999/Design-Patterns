package application;

public class Flag extends CompositeShape{
	
	DrawRectangle rectangle;
    DrawCircle circle;
    
    public Flag(double length, double width)
    {
        this.rectangle = new DrawRectangle(length,width);

        this.circle = new DrawCircle(width/4,150+length/2,150+width/2);

        buildShape();
    }

    public void buildShape ()
    {
        shapes.add(rectangle);
        shapes.add(circle);
    }

}
