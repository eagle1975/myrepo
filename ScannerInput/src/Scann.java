import java.util.Scanner;
public class Scann {
	public static void main(String[] args) {
		System.out.println("Input her name:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Hi " + str + "!");
		scan.close();
	}
}
