//Write a Java program to get file size in bytes, kb, mb.

package Assignment_5;

import java.io.File;

public class GetFileSize {
	
	private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }
 
    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }
 
    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
    }

	public static void main(String[] args) {
		 File file = new File("/Assignment_5/GetFileSize.java");
	        if(file.exists())
	        {
	        System.out.println(filesize_in_Bytes(file));
	        System.out.println(filesize_in_kiloBytes(file));
	        System.out.println(filesize_in_megaBytes(file));
	        }
	        else 
	        System.out.println("File doesn't exist");

	}

}
