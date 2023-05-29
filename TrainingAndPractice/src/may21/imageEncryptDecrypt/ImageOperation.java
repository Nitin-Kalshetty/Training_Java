package may21.imageEncryptDecrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageOperation {

	public static void main(String[] args) {
		System.out.println("Enter the path of file with name");
		Scanner sc = new Scanner(System.in);
		String filePath = sc.next();
		System.out.println("Enter the encryption key and remember it if lost file cannot be recovered...");
		int key = sc.nextInt();
		try {
			operate(filePath,key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void operate(String filePath,Integer key) throws IOException {
		
		if(filePath.charAt(0)==' ') {
			filePath = filePath.replace("\"","");
		}
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[fis.available()];
		fis.read(data);
		int i=0;
		for(byte b : data) {
			data[i] = (byte) (b^key);
			i++;
		}
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data);
		fos.close();
		fis.close();
		
 	}

}
