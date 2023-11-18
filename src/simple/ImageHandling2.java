package simple;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandling2 {

	public static void main(String[] args) throws IOException {
		//read imageFile and convert them into our wished extensions
		
		File imageFile = new File("C:\\Users\\kdarisi\\Downloads\\boost.jpg");
		BufferedImage image = ImageIO.read(imageFile);
		ImageIO.write(image, "jpg", new File("./boost.jpg")); //current directory amazon.jpg file will be created.
		ImageIO.write(image, "png", new File("./boost.png"));
		ImageIO.write(image, "PNG", new File("./images/boost.PNG"));
	}

}
