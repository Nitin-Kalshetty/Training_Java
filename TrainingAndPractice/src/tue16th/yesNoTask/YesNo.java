package tue16th.yesNoTask;

import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Scanner;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class YesNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Console console = System.console();
        if (console == null) {
            System.err.println("No console available.");
            System.exit(1);
        }
		System.out.println("Enter the userName");
		String userName = sc.nextLine();
//		char[] passwordArray = console.readPassword("Enter your password: ");
//        String password = new String(passwordArray);
//
//        // Do something with the password
//        System.out.println("Entered password: " + password);
		try {
			System.out.println("Enter the password");
			byte[] password = passwordToHashing(new String(console.readPassword("Enter your password: ")));
			new String(password, StandardCharsets.UTF_8);
			System.out.println(password);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Hey you have given wrong algorithm");
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			System.out.println("The key specification is wrong");
			e.printStackTrace();
		}
	}
	
	public static byte[] passwordToHashing(String cs) throws NoSuchAlgorithmException, InvalidKeySpecException {
		SecureRandom random = new SecureRandom();
		byte[] bytes = new byte[15];
		random.nextBytes(bytes);
		KeySpec ks = new PBEKeySpec(cs.toCharArray(), bytes, 65536,128);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		return skf.generateSecret(ks).getEncoded();
	}

}
