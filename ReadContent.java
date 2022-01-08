///Assignment_14_12_2021/src/Assignment_5/GetFileSize.java

package Assignment_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadContent {

	public static void main(String[] args) {
		String file_name = ("/home/students/test.txt");
        InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } 
            catch(Exception ex){
                 
            }
        }

	}
	
	

}
