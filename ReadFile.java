// Write a java program to read a file line by line and store it into a variable. 

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		String strLine="";
		String strData="";
		String filename = "/home/students/test.txt";
		
		try {
			BufferedReader br =new BufferedReader(new FileReader(filename));
			while(strLine !=null) {
				if(strLine == null) 
					break;
					strData += strLine;
					strLine =br.readLine();
			}
			System.out.println(strData);
			br.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
