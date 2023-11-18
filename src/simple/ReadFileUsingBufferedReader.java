package simple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		//we can pass this path inside of "FileReader"
		String path = "C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt";
		FileReader fr = new FileReader(path);
		
		/**
		 * We can directly pass this file into "FileReader"
		 * File file = new File("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		 * FileReader fr = new FileReader(file);
		 */
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println("file content is :");
		int c = 0;
		while ((c=br.read())!= -1) {
			System.out.print((char)c);
		}
		br.close();

	}

}
