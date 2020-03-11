package DecoratorDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		AddHeader head = new AddHeader(new Encryption(new Compress(new GeneralFile("Data of a normal text file"))));
		head.readFile();
		System.out.println("----------------------------------");
		head.writeFile();
	}

}
