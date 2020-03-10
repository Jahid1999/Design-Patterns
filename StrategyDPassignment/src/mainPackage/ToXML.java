package mainPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;

import javax.xml.transform.stream.StreamResult;

public class ToXML implements Type {
	BufferedReader in;
	StreamResult out;
	 String line,xml="";
	String[] result;
	
	public ToXML(){
		
	}
	
	public void conversion() {
		readFromFile();
		writeInFile();
	}
	
	public void readFromFile()
	{
		try {
            FileReader reader = new FileReader("student.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
           
 
            while ((line = bufferedReader.readLine()) != null) {
                process();
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    
		
	}
	
	public void process() {

		 result = line.split(",");
		 xml+= "<Student>\n<name>" + result[0] + "</name>\n";
		xml+= "<batch>" + result[1] + "</batch>\n";
		xml += "<roll>" + result[2] + "</roll>\n";
		xml += "<address>" + result[3] + "</adress>\n";
		xml += "<phone>" + result[4] + "</phone>\n</Student>\n\n";
				
	}

	public void writeInFile() 
	{
		try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write(xml);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

