package simple;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileUsingDesktop {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		if(Desktop.isDesktopSupported()) {
			System.out.println("Desktop is supported");
		}
		
		//store getDesktop in a desktop variable.
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//we can edit the file.
		desktop.edit(file);

	}

}
