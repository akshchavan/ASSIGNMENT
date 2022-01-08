//Write a Java program to append text to an existing file. 

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {

	public static void main(String[] args) throws IOException {
	    StringBuffer sb = new StringBuffer();
	    String strLine = "";
	    String filename = "";
	    
	    try {
	    	FileWriter fr = new FileWriter(filename,false);
	    	fr.write("java file");
	    	fr.close();
	    	
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} 
	    catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}

}
