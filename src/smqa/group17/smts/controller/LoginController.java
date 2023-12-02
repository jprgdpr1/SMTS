package smqa.group17.smts.controller;

public class LoginController {

	public static boolean isAlreadyRegistered(String username) {
		return DatabaseController.isAlreadyRegistered(username);
	}

	public static boolean login(String username, String password) {
		
		boolean isAuthenticatedUser = false;
		String passwordStoredInDb = DatabaseController.getPasswordForUsername(username);
		
		passwordStoredInDb = DecryptionController.decrypt(passwordStoredInDb);
		System.out.println(passwordStoredInDb);
		if(password.equals(passwordStoredInDb))
			isAuthenticatedUser = true;
		return isAuthenticatedUser;
		
	}

	public static void register(String newUsername, String newPassword) {
		
		String encryptedPassword = EncryptionController.encrypt(newPassword);
		DatabaseController.createUser(newUsername, encryptedPassword);
        
	}

}
