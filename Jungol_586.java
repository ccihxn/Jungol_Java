import java.util.Scanner;

public class Jungol_586 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int a = sr.nextInt(), b = sr.nextInt();
		System.out.println("("+a+" - "+b+") ^ 2 = "+(int)Math.pow(a-b, 2));
		System.out.println("("+a+" + "+b+") ^ 3 = "+(int)Math.pow(a+b, 3));
	}
}