import java.util.Scanner;

public class Jungol_530{
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int age = sr.nextInt();
		if(age >= 20) System.out.println("adult");
		else System.out.println(20-age+" years later");
	}
}