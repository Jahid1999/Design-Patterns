package mainPackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("1.Convert To XML \n2.Convert To CSV \n3.Convert To JSON\n");
		Scanner cin= new Scanner(System.in);
		int choice= cin.nextInt();
		
		if(choice==1)
		{
			ConverterClass conc=new ConverterClass(new ToXML());
			conc.getConversionType().conversion();
		}
		else if(choice==1)
		{
			ConverterClass conc=new ConverterClass(new ToCSV());
			conc.getConversionType().conversion();
		}
		else
		{
			ConverterClass conc=new ConverterClass(new ToJSON());
			conc.getConversionType().conversion();
		}
	}

}
