package may19.imageIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

public class ImageEncryptDecrypt {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, IOException {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the image file Path");
		String filePath = sc.next().replace("\"", "");
		File file = new File(filePath);
		BufferedImage image = ImageIO.read(file);
		System.out.println("Enter the encryption key and remember if forgot not able to decrypt...");
		byte[] secretKey = "mySecretKey".getBytes();
		SecretKeySpec sks = new SecretKeySpec(secretKey, "AES");
		
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, sks);
		byte[] check = (byte[]) image.getRaster().getDataElements(0, 0, image.getWidth(), image.getHeight(), null);
		byte[] cipherImage = cipher.doFinal(check);
		File fileEncrypted = new File("encrypted.jpg");
		ImageIO.write(ImageIO.read(new ByteArrayInputStream(cipherImage)), "jpg", fileEncrypted);
	}

}
