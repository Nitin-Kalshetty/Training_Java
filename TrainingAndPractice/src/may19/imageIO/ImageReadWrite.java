package may19.imageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ImageReadWrite {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the image File Path");
		String filePath = sc.next().replace("\"","");
		File inputFile = new File(filePath);
		BufferedImage image = ImageIO.read(inputFile);
		File outputFile = new File("output.jpg");
		ImageIO.write(image, "jpg", outputFile);

	}

}
