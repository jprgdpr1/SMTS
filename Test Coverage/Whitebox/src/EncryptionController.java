package smqa.group17.smts.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.*;

public class EncryptionController {
	
	private static final String secretKey = "b14ca5898a4e4133bbce2ea2315a1916"; 
    private static final String algorithm = "AES";

	public static String encrypt(String input) {
		// TODO Auto-generated method stub
		try {
            SecretKey key = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] encryptedBytes = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}

}
