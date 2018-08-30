
public class Password {

	public static void main(String[] args) {
		String password = "abcd";
		
		if (password.equals(args[0]))
			System.out.println("The password is correct!");
		else 
			System.out.println("Wrong password. Retype the password!");	
	}
}
