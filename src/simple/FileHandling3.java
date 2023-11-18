package simple;
import java.io.*;
import java.util.Scanner;

public class FileHandling3 {

	public static void main(String[] args) throws IOException {
		//String content2;
		//creating newfile in any position by using File class and giving content to the created file.
		/*System.out.println(System.getProperty("user.home"));
		File file = new File(System.getProperty("user.home") + "\\Downloads\\createdFile.txt");
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println("file is created");
			}
			else {
				System.out.println("file is already present....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream(file);
		System.out.println("enter file content...");
		String content = sc.nextLine();
		byte b[] = content.getBytes();
		fos.write(b);
		fos.close();
		sc.close();
		
		//Copy one file content to another file content.
		//statically we can copy one file content to other file.
		
		File file1 = new File("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		File file2 = new File("C:\\Users\\kdarisi\\Downloads\\WQADM-376REWORK\\1(eclipse)\\simple\\Sample.txt");
		FileInputStream fis1 = new FileInputStream(file1);
		//Scanner sca = new Scanner(fis1);
		FileOutputStream fos2 = new FileOutputStream(file2);
		int i=0;
		while((i=fis1.read())!= -1) {
			fos2.write(i);
		}
		System.out.println("copy finished.");
		//alternate way but don't try this.
		while(sca.hasNextLine()) {
			content2 = sca.nextLine();
			byte d[] = content2.getBytes();
			fos2.write(d);
		}
		fis1.close();
		fos2.close();*/
		//sca.close();
		
		//Creating file and giving content to that file by using scanner class with FileOutputStream
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter filename with location path..");
		String filename = scan.nextLine();
		FileOutputStream fos1 = new FileOutputStream(filename, true);
		System.out.println("enter file content..");
		String content1 = scan.nextLine();
		byte c[] = content1.getBytes();
		fos1.write(c);
		fos1.close();
		scan.close();
		
	}

}
