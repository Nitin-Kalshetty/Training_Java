package tue16th.yesNoTask;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Scanner;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class hardCodedUserPass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "Nitin";
		String algo = "PBKDF2WithHmacSHA1";
		

	}
	
	public byte[] hashTheString(String password,String algorithm) throws NoSuchAlgorithmException, InvalidKeySpecException {
		SecureRandom sr = new SecureRandom();
		byte[] bytes = new byte[15];
		sr.nextBytes(bytes);
		KeySpec ks = new PBEKeySpec(password.toCharArray(),bytes,65536,128);
		SecretKeyFactory skf = SecretKeyFactory.getInstance(algorithm);
		return skf.generateSecret(ks).getEncoded();
	}

}
