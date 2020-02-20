package CompositeDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec =new Rectangle();
		//rec.buildShape();
		rec.draw();
		
		
		System.out.println("----------");
		
		Flag flag=new Flag();
		flag.draw();
	}

}

