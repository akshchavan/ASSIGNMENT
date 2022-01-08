//Write a Java program to store text file content line by line into an array. 

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StroreTextFile {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		String filename = "/home/students/test.txt";
		
		ArrayList<String> a = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(strLine != null) {
				
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				
				if(strLine == null)
					break;
				a.add(strLine);
			}
			System.out.println(Arrays.toString(a.toArray()));
			br.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
