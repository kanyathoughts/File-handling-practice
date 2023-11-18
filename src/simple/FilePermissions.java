package simple;

import java.io.File;

public class FilePermissions {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\kdarisi\\Downloads\\WQADM-376REWORK\\1(eclipse)\\simple\\src\\simple\\FileHandling.java");
		
		file.setWritable(true);
		file.setReadable(false);
		file.setExecutable(false);
		System.out.println("done..");
	}

}
