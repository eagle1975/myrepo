
public class Password {

	public static void main(String[] args) {
		String password = "abcd";
		
		if (password.equals(args[0]))
			System.out.println("Пароль верный!");
		else 
			System.out.println("Повторите ввод пароля!");	
	}
}
