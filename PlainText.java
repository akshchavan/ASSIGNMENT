///. Write a Java program to read a plain text file

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class PlainText {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		
		String filename= "/home/students/myfile.txt";
		
		 try {
			FileWriter fw = new FileWriter(filename,false);
			fw.write("python");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			while(strLine !=null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine= br.readLine();
				System.out.println(strLine);
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
