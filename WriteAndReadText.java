//Write a Java program to write and read a plain text file. 

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndReadText {

	public static void main(String[] args) throws IOException {
		StringBuffer sb =new StringBuffer();
		String strLine = "";
		String filename = "";
		
		try {
			FileWriter fw = new FileWriter(filename,false);
			fw.write("java");
			fw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(strLine != null) {
				sb.append(strLine);
				sb.append(br.readLine());
				strLine = br.readLine();
			}
			System.out.println();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
