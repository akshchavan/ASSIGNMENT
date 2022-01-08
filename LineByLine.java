//Write a Java program to read a file content line by line

package Assignment_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		String strLine = " ";
		
		try {
			br = new BufferedReader(new FileReader("/home/students/test.txt"));
			while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
		}
		     br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

	}

}
