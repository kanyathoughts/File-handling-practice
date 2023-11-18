package simple;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		//open the file using Desktop class and read content by FileInputStream.
		Desktop desktop = Desktop.getDesktop();
		desktop.open(file);
		FileInputStream fis = new FileInputStream(file);
		System.out.println("file content is:");
		int c = 0;
		while((c=fis.read())!= -1) {
			//System.out.println(c); // if you do like bytes will print.
			System.out.print((char)c); //convert from ascii code to character.
			
		}
		fis.close();
		

	}

}
