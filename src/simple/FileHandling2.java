package simple;
import java.io.*;
import java.util.Arrays;
public class FileHandling2 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\kdarisi\\Desktop\\disc");
		File fileArray[] = file.listFiles();
		
		Arrays.sort(fileArray);
		for (File e:fileArray) {
			if(e.isFile()) {
				System.out.println("file : " + e.getName());
			}
			else if (e.isDirectory()) {
				System.out.println("Directory : "+ e.getName());
			}
			else {
				System.out.println("not known : " + e.getName());
			}
		}

	}

}
