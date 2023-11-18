package simple;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2019/July/amazonbasics_520x520._SY304_CB442725065_.jpg");
		try {
			BufferedImage image =ImageIO.read(url);
			ImageIO.write(image, "jpg", new File("./amazon.jpg")); //current directory amazon.jpg file will be created.
			ImageIO.write(image, "png", new File("./amazon.png"));
			ImageIO.write(image, "PNG", new File("./images/amazon.PNG"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
