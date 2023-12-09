package smqa.group17.smts.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.*;

public class DecryptionController {
	
	private static final String secretKey = "b14ca5898a4e4133bbce2ea2315a1916"; 
    private static final String algorithm = "AES";

	public static String decrypt(String input) {
		// TODO Auto-generated method stub
		try {
            SecretKey key = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, key);

            byte[] decodedBytes = Base64.getDecoder().decode(input);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}

}
