package simple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileByUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		Scanner sc = new Scanner(file);
		System.out.println("file content is :");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
