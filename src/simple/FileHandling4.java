package simple;
import java.io.*;
import java.util.*;


public class FileHandling4 {
	public static void main(String[] args) throws IOException {
		
		//Dynamically we can give file names to copy one file content to other file.
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the source file name");
		String sorceFile = sc.next();
		System.out.println("Provide destination file name");
		String destFile = sc.next();
		
		FileInputStream fi = new FileInputStream(sorceFile);
		FileOutputStream fo = new FileOutputStream(destFile);
		int i=0;
		while((i=fi.read())!= -1) {
			fo.write(i);
		}
		fi.close();
		fo.close();
		sc.close();
	}

}
