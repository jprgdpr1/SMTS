package smqa.group17.smts.controller;

public class LoginController {

	public static boolean isAlreadyRegistered(String username) throws Exception{
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

	public static String register(String newUsername, String newPassword) {
		
		String encryptedPassword = EncryptionController.encrypt(newPassword);
		DatabaseController.createUser(newUsername, encryptedPassword);
        return "Registration Successfull";
	}

}
