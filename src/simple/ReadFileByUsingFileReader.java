package simple;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileByUsingFileReader {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\kdarisi\\Desktop\\disc\\testFileOutput.txt";
		FileReader fr = new FileReader(path);
		System.out.println("file content is:");
		int c = 0;
		while((c=fr.read())!= -1) {
			System.out.print((char)c);
		}
		fr.close();
		
		
	}

}
