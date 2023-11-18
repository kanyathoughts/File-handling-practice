package simple;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandling3 {

	public static void main(String[] args) throws IOException {
		getImageFromFilePath1("./images/boost.PNG");
		

	}
	public static RenderedImage getImageFromFilePath1(String path) throws IOException {
		return ImageIO.read(new File(path));
	}

}
